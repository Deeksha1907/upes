package com.example.upes.presentation.screens.authentication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.upes.R
import com.example.upes.presentation.screens.user.User

class Assessment_page : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.assessment_page)

        val submit = findViewById<Button>(R.id.submit)
        submit.setOnClickListener {
            startActivity(Intent(this, User::class.java))
        }

    }
}
