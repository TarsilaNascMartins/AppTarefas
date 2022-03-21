package com.tarsilanascmartins.tarefaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PrimeiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira)

        val bLogin = findViewById<Button>(R.id.bLogin)
        val intentSegunda = Intent(this,MainActivity::class.java)

        bLogin.setOnClickListener {
            startActivity(intentSegunda)
        }



    }
}