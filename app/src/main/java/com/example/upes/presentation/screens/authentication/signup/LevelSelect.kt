package com.example.upes.presentation.screens.authentication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.upes.R
import com.example.upes.presentation.screens.user.User

class LevelSelect : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.level_select)

        val yes = findViewById<Button>(R.id.next)
        val no = findViewById<Button>(R.id.no)
        yes.setOnClickListener {
            val intent = Intent(this, PriorKnow::class.java)
            startActivity(intent)
        }

        no.setOnClickListener{
            val intent = Intent(this, User::class.java)
            startActivity(intent)
        }

    }

}
