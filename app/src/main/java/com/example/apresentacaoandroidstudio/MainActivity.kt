package com.example.apresentacaoandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    /**lateinit é utilizado para Declarar uma variavel global*/
    lateinit var campo1: EditText
    lateinit var botao1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /** sempre escrever o codigo depois de abrir o layout */
        /**Instanciando a variavel e atribuindo o metodo para pegar o id do componente
         * e linkar ele com a variavel global */
        campo1 = findViewById(R.id.nome)
        botao1 = findViewById(R.id.botao)
        botao1.setOnClickListener(object : View.OnClickListener {
            /**Adicionando evento onClick e mostrando mensagem pro usuario(contexto exibido, mensagem, tempo).mostrar() */
            override fun onClick(p0: View?) {
                var textoDigitado = campo1.text.toString()
                Toast.makeText(applicationContext, textoDigitado, Toast.LENGTH_LONG).show()
            }

        })
    }
}