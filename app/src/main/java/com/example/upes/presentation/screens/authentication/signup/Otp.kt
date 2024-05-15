package com.example.upes.presentation.screens.authentication
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.upes.R
import com.example.upes.databinding.OtpBinding
import com.example.upes.databinding.SignupBinding

class Otp : AppCompatActivity() {
    lateinit var binding: OtpBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= OtpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signupBtn.setOnClickListener{
            val intent= Intent(this, LevelSelect::class.java)
            startActivity(intent)
        }



    }
}
