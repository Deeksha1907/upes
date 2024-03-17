package com.example.upes.api

import com.example.upes.model.BlogResModel
import com.example.upes.model.SignupRequestModel
import com.example.upes.model.SignupResModel
import com.example.upes.model.TestResModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface CyberStrikeApi {
    @POST("register/")
    suspend fun register(@Body signupRequestModel: SignupRequestModel): Response<SignupResModel>

    @GET("/")
    suspend fun test(): Response<TestResModel>

    @GET("blog/")
    suspend fun blog(): Response<BlogResModel>
}