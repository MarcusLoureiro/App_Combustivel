package com.example.desafiocombustivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var edit_gasolina: EditText
    private lateinit var edit_etanol: EditText
    private lateinit var text_exibir: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit_gasolina = findViewById(R.id.edit_gasolina)
        edit_etanol = findViewById(R.id.edit_etanol)
        text_exibir = findViewById(R.id.text_exibir)
    }
    fun calcular(view: View){
        val gasolina: Double = edit_gasolina.text.toString().toDouble()
        val etanol: Double = edit_etanol.text.toString().toDouble()
        if(etanol < (gasolina*0.7)){
            text_exibir.setText("ABASTEÇA COM ETANOL")
        }else{
            text_exibir.setText("ABASTEÇA COM GASOLINA")
        }
    }
}