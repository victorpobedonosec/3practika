package com.example.practuhv3

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        setupButtonListeners()
    }


        private fun setupButtonListeners() {
            findViewById<ImageButton>(R.id.imageButton2).setOnClickListener {
                // Обработка нажатия на "лайк"
                Toast.makeText(this, "Liked!", Toast.LENGTH_SHORT).show()
            }

            findViewById<ImageButton>(R.id.imageButton3).setOnClickListener {
                // Обработка нажатия на "шер"
                Toast.makeText(this, "Shared!", Toast.LENGTH_SHORT).show()
            }

            findViewById<ImageButton>(R.id.imageButton4).setOnClickListener {
                // Обработка нажатия на "просмотр"
                Toast.makeText(this, "View Count!", Toast.LENGTH_SHORT).show()
            }
        }

    }
