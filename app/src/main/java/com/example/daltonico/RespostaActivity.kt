package com.example.daltonico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.daltonico.databinding.ActivityMainBinding
import com.example.daltonico.databinding.ActivityRespostaBinding

class RespostaActivity : AppCompatActivity() {

    lateinit var binding: ActivityRespostaBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resposta)

        val buttonCancelar = findViewById<Button>(R.id.buttonCancelar)
        val buttonOk = findViewById<Button>(R.id.buttonEnviarResposta)
        val editTextDigitesuaResposta = findViewById<EditText>(R.id.editTextDigiteAresposta)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_resposta)



        buttonCancelar.setOnClickListener {
            setResult(RESULT_CANCELED)
            finish()

        }
    }
}