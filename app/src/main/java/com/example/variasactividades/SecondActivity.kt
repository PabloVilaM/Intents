package com.example.variasactividades

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = getIntent()

        val nro1 = intent.getIntExtra("numerouno",0)
        val nro2 = intent.getIntExtra("numerodos",0)
        intent.putExtra("suma" , nro1 + nro2)

        //val numeroClientes = findViewById<TextView>(R.id.textView2)

        //numeroClientes.text = value.toString()

        //intent.putExtra("saludo" , "Hola")

        setResult(Activity.RESULT_OK, intent)
    }
}