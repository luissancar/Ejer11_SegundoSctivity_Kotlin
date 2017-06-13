package com.example.luissancar.ejer11_segundosctivity_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener()
        {
            val intent = Intent(this,Main2Activity::class.java)
            intent.putExtra("texto",texto.text.toString())
         //   println(texto.text)
            startActivity(intent)
        }

    }


}