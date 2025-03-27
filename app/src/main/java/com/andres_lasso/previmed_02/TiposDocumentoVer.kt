package com.andres_lasso.previmed_02

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TiposDocumentoVer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tipos_documento_ver)

        // lista de tipos de documento
        val arrayAdapter: ArrayAdapter<*>
        var listaTipoDocumento = arrayOf(
            "Cedula de Ciudadania",
            "Cedula de Extranjeria",
            "Tarjeta de Identidad",
            "Pasaporte"
        )

        // aquí le doy forma a la lista para que la reconozca el elemento del layout
        var miListView = findViewById<ListView>(R.id.listView)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaTipoDocumento)
        miListView.adapter = arrayAdapter

        // aqui Recivo el dato del nuevo documento
        val nuevoDocumento = intent.getStringExtra("nuevoDocumento")
        if (!nuevoDocumento.isNullOrEmpty()) {
            // agregar el nuevo documento a la lista
            listaTipoDocumento += nuevoDocumento
            // actualizar el adaptador con la nueva lista
            miListView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaTipoDocumento)

            //mensaje de confirmación
            Toast.makeText(this, "Documento agregado: $nuevoDocumento", Toast.LENGTH_SHORT).show()
        }

        // botón de navegación
        findViewById<Button>(R.id.btn_add_tipo_documento).setOnClickListener {
            startActivity(Intent(this, AddTipoDocumento::class.java))
        }
    }
}
