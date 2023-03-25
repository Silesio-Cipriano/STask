package com.scipriano.stask

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

    class TaskActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.task)
            println("Vermelho");

            val imageButton=findViewById<ImageButton>(R.id.btnCheck);
            val listener = View.OnClickListener { view ->
                view.setBackgroundColor(Color.RED)
                println("Vermelho");
            }
            imageButton.setOnClickListener(listener)

        }
    }
