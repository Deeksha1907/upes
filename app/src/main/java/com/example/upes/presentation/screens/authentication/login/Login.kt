package com.example.upes.presentation.screens.authentication.login
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.upes.R
import com.example.upes.databinding.LoginBinding

class Login : AppCompatActivity() {
    //intialize view binding
    lateinit var binding: LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener{

        }


    }
}