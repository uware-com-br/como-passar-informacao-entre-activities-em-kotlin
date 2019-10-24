package br.com.uware.como_passar_informacao_entre_activities_em_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOpenActivity.setOnClickListener {
            val intent = Intent(this, NovaActivity::class.java)
            intent.putExtra("name", etName.text.toString())
            intent.putExtra("age", etAge.text.toString().toInt())
            startActivity(intent)
        }
    }
}
