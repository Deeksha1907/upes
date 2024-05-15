package com.example.upes.presentation.screens.authentication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.upes.R

class Pmod1_lvl1 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pmod1_lvl1)

        val button = findViewById<Button>(R.id.next)
        button.setOnClickListener {
            val intent = Intent(this, Pmod3_lvl3_1::class.java)
            startActivity(intent)

        }
    }
}
