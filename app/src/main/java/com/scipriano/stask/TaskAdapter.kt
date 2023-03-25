package com.scipriano.stask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter (private val tasks:List<Tasks.Task>):
    RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context);
        val view =layoutInflater.inflate(R.layout.task,parent,false);
        return TaskViewHolder(view);
    }

    override fun getItemCount(): Int {
        return tasks.size
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(tasks[position])
    }

    class TaskViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(data:Tasks.Task){
            with(itemView){
                val txtTaskName=findViewById<TextView>(R.id.taskTitle);
                val checkTaskDone=findViewById<ImageButton>(R.id.taskCheck);

                txtTaskName.text= data.name;
            }
        }
    }

}