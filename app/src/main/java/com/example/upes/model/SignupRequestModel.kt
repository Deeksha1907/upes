package com.example.upes.model

data class SignupRequestModel(
    val age: Int,
    val email: String,
    val full_name: String,
    val gender: String,
    val mobile_number: String,
    val password: String,
    val password2: String
)