package com.andres_lasso.previmed_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TiposDocumentoVer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tipos_documento_ver)

        //boton de navegacion

        findViewById<Button>(R.id.btn_add_tipo_documento).setOnClickListener{
            startActivity(Intent(this, AddTipoDocumento::class.java))
        }

    }
}