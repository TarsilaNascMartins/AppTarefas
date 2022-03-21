package com.tarsilanascmartins.tarefaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NovaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova)

        val clique = findViewById<Button>(R.id.clique)

        clique.setOnClickListener {
            finish()

        }


    }
}