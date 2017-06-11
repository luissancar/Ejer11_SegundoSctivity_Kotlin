package com.example.luissancar.ejer11_segundosctivity_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.luissancar.ejer11_segundosctivity_kotlin.R.id.button2
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button2.setOnClickListener ()
        {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
