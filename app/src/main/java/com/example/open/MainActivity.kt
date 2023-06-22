package com.example.open

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.example.open.databinding.ActivityMainBinding


    class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding

        // on below line we are creating
        // variables for text view and calendar view
        lateinit var dateTV: TextView
        lateinit var calendarView: CalendarView
        lateinit var button3: Button


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
/*
            binding.button3.setOnClickListener(View.OnClickListener {
                Toast.makeText(this, "You don't have much time to complete today's daily task!", Toast.LENGTH_SHORT).show()
            })
*/
            // initializing variables of
            // list view with their ids.
            dateTV = findViewById(R.id.idTVDate)
            calendarView = findViewById(R.id.calendarView)

            // on below line we are adding set on
            // date change listener for calendar view.
            calendarView
                .setOnDateChangeListener(
                    OnDateChangeListener { view, year, month, dayOfMonth ->
                        // In this Listener we are getting values
                        // such as year, month and day of month
                        // on below line we are creating a variable
                        // in which we are adding all the variables in it.
                        val Date = (dayOfMonth.toString() + "-"
                                + (month + 1) + "-" + year)

                        // set this date in TextView for Display
                        dateTV.setText(Date)

                    })

            val buttonClick = findViewById<Button>(R.id.button2)
            buttonClick.setOnClickListener {
                val intent = Intent(this, ProgActivity::class.java)
                startActivity(intent)
            }
        }
    }