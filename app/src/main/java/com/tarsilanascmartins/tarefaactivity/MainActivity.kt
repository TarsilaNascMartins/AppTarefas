package com.tarsilanascmartins.tarefaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instanciar botão
        val bSalve = findViewById<Button>(R.id.bSalve)
        val bLista = findViewById<Button>(R.id.bLista)
        //Instanciar a segunda pag de tarefa
        val segundaIntent = Intent(this,CadastroActivity::class.java)
        val fragmentIntent = Intent(this,NovaActivity::class.java)

        bSalve.setOnClickListener {
                startActivity(segundaIntent)
        }

        bLista.setOnClickListener {
            startActivity(fragmentIntent)
        }

       val tarefa = intent.getStringExtra("TAREFA")
       val responsavel = intent.getStringExtra("RESPONSAVEL")
        val detalhes = intent.getStringExtra("DETALHES")
        val data = intent.getStringExtra("DATA")


        val textGuarda = findViewById<TextView>(R.id.textoGuarda)
        if(tarefa.isNullOrBlank()||responsavel.isNullOrBlank()||detalhes.isNullOrBlank()||data.isNullOrBlank()){
        textGuarda.text = "Adicione uma tarefa"}
        else {
            textGuarda.text = "Tarefa: $tarefa" +
                    "\n Responsável: $responsavel" +
                    "\nDetalhes: $detalhes" +
                    "\nData: $data"


        }

    }
}