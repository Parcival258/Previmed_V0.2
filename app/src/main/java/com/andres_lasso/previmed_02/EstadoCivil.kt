package com.andres_lasso.previmed_02

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EstadoCivil : AppCompatActivity() {
    private lateinit var textEstadoCivil: EditText
    private lateinit var btnGuardarEstadoCivil: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estado_civil)
        btnGuardarEstadoCivil = findViewById(R.id.btnGuardarEstadoCivil)
        textEstadoCivil = findViewById(R.id.textEstadoCivil)

        btnGuardarEstadoCivil.setOnClickListener(View.OnClickListener {
            try {
                Toast.makeText(
                    this@EstadoCivil,
                    "Estado civil creado",
                    Toast.LENGTH_SHORT
                ).show()
            } catch (e: Exception) {
                Toast.makeText(
                    this@EstadoCivil,
                    "No se pudo crear el estado civil",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}