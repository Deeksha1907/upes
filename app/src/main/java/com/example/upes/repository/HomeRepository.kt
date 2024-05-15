package com.example.upes.repository

import com.example.sharesphere.data.remote.dto.error.ServerErrorDto
import com.example.upes.api.ApiResponse
import com.example.upes.api.CyberStrikeApi
import com.example.upes.model.BlogResModel
import com.google.gson.Gson
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import timber.log.Timber
import javax.inject.Inject

class HomeRepository @Inject constructor(private val cyberStrikeApi: CyberStrikeApi) {
    fun blog(): Flow<ApiResponse<BlogResModel>> = flow {
        try {
            emit(ApiResponse.Loading())
            val response = cyberStrikeApi.blog()
            if (response.isSuccessful) {
                emit(ApiResponse.Success(response.body()!!))
                Timber.d(response.body().toString())
            } else {
                val error = response.errorBody()?.string() ?: ""
                val parsedError = Gson().fromJson(error, ServerErrorDto::class.java)
                val errorMessage = parsedError?.errors?.message ?: ""
                emit(ApiResponse.Error(errorMessage))
                Timber.d(errorMessage.toString())
            }
        } catch (e: Exception) {
            emit(ApiResponse.Error("Internal Server Error"))
            Timber.d("server error")
        }
    }
}