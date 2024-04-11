package com.example.upes.presentation.screens.authentication
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.upes.R

class Pmod3_lvl3_1 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pmod3_lvl3_1)
val image=findViewById<ImageView>(R.id.treasure1)
        image.setOnClickListener{
            startActivity(Intent(this, Pmod3_lvl3_2::class.java))
        }


    }
}
