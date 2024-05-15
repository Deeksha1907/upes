package com.example.upes.presentation.screens.authentication
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.upes.R

class Pmod3_lvl3_3 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pmod3_lvl3_3)

val image=findViewById<ImageView>(R.id.treasure3)
        image.setOnClickListener{
            val intent= Intent(this,Pmod3_lvl3_4::class.java)
            startActivity(intent)
        }

    }
}
