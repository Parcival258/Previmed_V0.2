package com.andres_lasso.previmed_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddTipoDocumento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_tipo_documento)

        //boton guardar
        findViewById<Button>(R.id.btn_guardar_documento).setOnClickListener {
            val nuevoDocumento = findViewById<EditText>(R.id.edt_imput_nombre_documento).text.toString()
            val intent = Intent(this, TiposDocumentoVer::class.java)
            //mando el nuevo documento a la otra actividad usando .putExtra() que recibe el nombre de la variable y el valor
            intent.putExtra("nuevoDocumento", nuevoDocumento)
            startActivity(intent)
        }



    }
}