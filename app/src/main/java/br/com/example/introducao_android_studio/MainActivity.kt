 package br.com.example.introducao_android_studio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        tvResultado.text = "Texto alterado"
    }
}