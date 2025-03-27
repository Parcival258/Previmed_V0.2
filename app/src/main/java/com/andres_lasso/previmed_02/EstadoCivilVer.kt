package com.andres_lasso.previmed_02

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class EstadoCivilVer : AppCompatActivity() {
    private lateinit var listaEstadoCiviles: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estado_civil_ver)
        listaEstadoCiviles = findViewById(R.id.listadoEstadoCivil)
        val arrayAdapter: ArrayAdapter<*>
        val estadosCiviles = arrayOf(
            "Soltero",
            "Casado",
            "Unión Libre",
            "Divorciado",
            "Viudo"

        )


        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, estadosCiviles)
        listaEstadoCiviles.adapter = arrayAdapter
    }
}