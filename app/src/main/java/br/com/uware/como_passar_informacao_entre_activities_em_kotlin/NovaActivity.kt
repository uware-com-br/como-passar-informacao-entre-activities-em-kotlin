package br.com.uware.como_passar_informacao_entre_activities_em_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nova.*

class NovaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova)
        tvNova.text = "Nome: "+intent.getStringExtra("name")+"\nIdade: "+intent.getIntExtra("age", 0)
    }
}
