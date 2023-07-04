package com.example.apresentacaoandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    /**lateinit é utilizado para instanciar uma variavel global*/
    lateinit var campo1: EditText
    lateinit var botao1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /** sempre escrever o codigo depois de abrir o layout */
    }
}