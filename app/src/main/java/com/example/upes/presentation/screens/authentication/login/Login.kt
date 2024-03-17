package com.example.upes.presentation.screens.authentication.login
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.upes.databinding.LoginBinding
import com.example.upes.presentation.screens.user.User

class Login : AppCompatActivity() {
    //intialize view binding
    lateinit var binding: LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener{

            val intent= Intent(this, User::class.java)
            startActivity(intent)
        }


    }
}