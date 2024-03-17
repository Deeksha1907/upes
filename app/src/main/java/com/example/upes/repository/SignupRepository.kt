package com.example.upes.repository

import com.example.sharesphere.data.remote.dto.error.ServerErrorDto
import com.example.upes.api.ApiResponse
import com.example.upes.api.CyberStrikeApi
import com.example.upes.model.SignupRequestModel
import com.example.upes.model.SignupResModel
import com.example.upes.model.TestResModel
import com.google.gson.Gson
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import timber.log.Timber
import javax.inject.Inject

class SignupRepository @Inject constructor(private val cyberStrikeApi: CyberStrikeApi) {

    fun signup(signupRequestModel: SignupRequestModel): Flow<ApiResponse<SignupResModel>> = flow {
//        try {
//            Timber.d(signupRequestModel.toString())
//            emit(ApiResponse.Loading())
//            val response = cyberStrikeApi.register(signupRequestModel)
//            Timber.d(response.toString())
//            emit(ApiResponse.Success(response))
//        } catch (e: HttpException) {
//            val error = e.response()?.errorBody()?.string() ?: ""
//            val parsedError = Gson().fromJson(error, ServerErrorDto::class.java)
//            val errorMessage = parsedError?.errors?.message ?: ""
//            emit(ApiResponse.Error(errorMessage))
//            Timber.d(errorMessage.toString())
//        } catch (e: IOException) {
//            emit(ApiResponse.Error("Internal Server Error"))
//            Timber.d("server error")
//        }
//    }.flowOn(Dispatchers.IO)
//        try {
//            emit(ApiResponse.Loading())
//            Timber.d(signupRequestModel.toString())
//            val response = cyberStrikeApi.register()
//            if (response.isSuccessful) {
//                emit(ApiResponse.Success(response.body()!!))
//                Timber.d(response.body().toString())
//            } else {
//                val error = response.errorBody()?.string() ?: ""
//                val parsedError = Gson().fromJson(error, ServerErrorDto::class.java)
//                val errorMessage = parsedError?.errors?.message ?: ""
//                emit(ApiResponse.Error(errorMessage))
//                Timber.d(errorMessage.toString())
//            }
//        } catch (e: Exception) {
//            emit(ApiResponse.Error("Internal Server Error"))
//            Timber.d("server error")
//        }


    }
}