package com.example.laboratorio0401

import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var timePicker: TimePicker
    private lateinit var datePicker: DatePicker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        timePicker = findViewById(R.id.timePicker)
        timePicker.setIs24HourView(true)

        datePicker = findViewById(R.id.datePicker)
    }

    fun onClick(view: View) {
        val hour = timePicker.hour
        val minute = timePicker.minute

        Toast.makeText(
            this,
            "Hora seleccionada $hour:$minute",
            Toast.LENGTH_SHORT
        ).show()
    }

    // Método para mostrar la fecha seleccionada
    fun onClickFecha(view: View) {
        val day = datePicker.dayOfMonth
        val month = datePicker.month
        val year = datePicker.year

        Toast.makeText(
            this,
            "Fecha seleccionada $day/$month/$year",
            Toast.LENGTH_SHORT
        ).show()
    }
}