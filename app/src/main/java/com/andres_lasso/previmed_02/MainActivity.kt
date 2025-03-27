package com.andres_lasso.previmed_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //botons de navegación

        findViewById<Button>(R.id.btn_tipos_documento).setOnClickListener{
            startActivity(Intent(this, AddTipoDocumento::class.java))
        }
        findViewById<Button>(R.id.btn_tipos_documento_ver).setOnClickListener{
            startActivity(Intent(this, TiposDocumentoVer::class.java))
        }
        findViewById<Button>(R.id.btn_estado_civil).setOnClickListener{
            startActivity(Intent(this, EstadoCivil::class.java))
        }
        findViewById<Button>(R.id.btn_estado_civil_ver).setOnClickListener{
            startActivity(Intent(this, EstadoCivilVer::class.java))
        }

    }
}