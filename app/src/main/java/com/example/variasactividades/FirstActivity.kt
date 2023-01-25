package com.example.variasactividades

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.TextView

class FirstActivity : AppCompatActivity() {
    var RESULTADO_UNO = 1
    var RESULTADO_DOS = 2
    var REQUEST_IMAGE_CAPTURE = 3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var camActi =  findViewById<Button>(R.id.button)
        var segundaActi = findViewById<Button>(R.id.button2)
        val text =

        camActi.setOnClickListener{

            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,REQUEST_IMAGE_CAPTURE)
            /*val navegador = Intent(Intent.ACTION_VIEW)
            val url = "http://www.google.com"
            navegador.data = Uri.parse(url.toString())
            startActivity(intent)*/
            /*val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("numerouno",3)
            intent.putExtra("numerodos",3)
            startActivityForResult(intent, RESULTADO_UNO)
            intent.putExtra("numerouno",4)
            intent.putExtra("numerodos",4)
            startActivityForResult(intent, RESULTADO_DOS)
            intent.putExtra("numerouno",5)
            intent.putExtra("numerodos",5)
            startActivityForResult(intent, RESULTADO_TRES)*/
        }

        segundaActi.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            startActivityForResult(intent, RESULTADO_UNO)
            intent.putExtra("numerouno",3)
            intent.putExtra("numerodos",3)


        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val saludo = findViewById<TextView>(R.id.textView)

        if(resultCode != Activity.RESULT_OK) return
        when(requestCode) {
            RESULTADO_UNO -> {
                if (data != null) {
                    saludo.text = data.getStringExtra("suma")
                }; }
            RESULTADO_DOS -> {
                if (data != null) {

                }; }
            // Other result codes
            else -> {}
        }
    }
}