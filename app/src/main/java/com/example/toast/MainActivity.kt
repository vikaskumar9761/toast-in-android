package com.example.toast

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val hellow=findViewById<Button>(R.id.hellowbtn)
        val number=findViewById<Button>(R.id.numberbtn)
        val btn=findViewById<Button>(R.id.button3)
        
        hellow.setOnClickListener {
            Toast.makeText(this, "Hellow how are You", Toast.LENGTH_SHORT).show()
            
        }
        number.setOnClickListener {
            Toast.makeText(this, "Your namber is 9761747710", Toast.LENGTH_SHORT).show()
        }
        
        btn.setOnClickListener {
            Toast.makeText(this, "Clicked button", Toast.LENGTH_SHORT).show()
        }
    }
}