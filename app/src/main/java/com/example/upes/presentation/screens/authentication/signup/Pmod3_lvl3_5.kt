package com.example.upes.presentation.screens.authentication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.upes.R
import com.example.upes.presentation.screens.user.User

class Pmod3_lvl3_5 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pmod3_lvl3_5)

        val image = findViewById<ImageView>(R.id.treasure5)
        image.setOnClickListener {
            val intent = Intent(this, User::class.java)
            startActivity(intent)
        }

    }
}
