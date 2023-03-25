package com.scipriano.stask

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.scipriano.stask.modification.SpaceItemDecoration
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tasks();



    }

    fun tasks(){
        val taskList = findViewById<RecyclerView>(R.id.taskList);
        taskList.addItemDecoration(SpaceItemDecoration(30))

        val tasks = Tasks().getTasks()

        println(tasks[0].name);
        val adapter=TaskAdapter(tasks);

        taskList.adapter=adapter

    }

    fun daysOfMonth ():List<Int>{
        val calendar = Calendar.getInstance()
        val daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
        val daysList = mutableListOf<Int>()

        for (day in 1..daysInMonth) {
            daysList.add(day)
        }

        return daysList
    }

}