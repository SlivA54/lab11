package com.example.lab11

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val data : EditText = findViewById<EditText>(R.id.editTextText2)
        val Res : TextView = findViewById<TextView>(R.id.textView2)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            Res.setText(Result(data.getText().toString(),Res.toString()))
        }


    }

    private fun Result(data : String, Res : String): String{
        val AB = 4
        val AC = 6
        val S = 0.5 * AC

        val b = if((data == "Площадь") || (data == "Площадь ")) S
        else if((data == "Катет") || (data == "Катет ")) AB
        else if((data == "Гипотенуза") || (data == "Гипотенуза "))AC
        else "Я ничего не выведу бе-бе-бе"

        return "$b"
    }

}