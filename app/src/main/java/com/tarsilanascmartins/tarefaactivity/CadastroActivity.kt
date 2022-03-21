package com.tarsilanascmartins.tarefaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        //Instanciar botão
        val bSalvar = findViewById<Button>(R.id.bSalvar)
        val intentPrimeira = Intent(this, MainActivity::class.java)
        //  Instanciar PlainText
        val editTarefa = findViewById<TextView>(R.id.editTarefa)
        val editResponsavel = findViewById<TextView>(R.id.editResponsavel)
        val editDetalhes = findViewById<TextView>(R.id.editDetalhe)
         val editData = findViewById<TextView>(R.id.editData)

        bSalvar.setOnClickListener {

           val tarefa = editTarefa.text.toString()
           val responsavel = editResponsavel.text.toString()
          val detalhes = editDetalhes.text.toString()
          val data = editData.text.toString()

            if(tarefa.isEmpty()||responsavel.isEmpty()||detalhes.isEmpty()||data.isEmpty()){
             Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG).show()
            } else {
                intentPrimeira.putExtra("TAREFA",tarefa)
                intentPrimeira.putExtra("RESPONSAVEL",responsavel)
               intentPrimeira.putExtra("DETALHES",detalhes)
                intentPrimeira.putExtra("DATA",data)

                startActivity(intentPrimeira)
            }

        }








    }
}