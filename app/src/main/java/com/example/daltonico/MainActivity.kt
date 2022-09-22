package com.example.daltonico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.daltonico.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textoResposta1 = findViewById<TextView>(R.id.textViewResposta1)
        val textoResposta2 = findViewById<TextView>(R.id.textViewResposta2)
        val textoResposta3 = findViewById<TextView>(R.id.textViewResposta3)

        binding.buttonVerificar.setOnClickListener {
            Toast.makeText(this, binding.textViewResultado.text, Toast.LENGTH_SHORT).show()
        }
    }
}