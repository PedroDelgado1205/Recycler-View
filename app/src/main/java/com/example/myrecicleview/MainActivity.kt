package com.example.myrecicleview;

import TaskAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecicleview.R
import com.example.myrecicleview.Task

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tasks = listOf(
        Task("Tarea 1"),
        Task("Tarea 2"),
        Task("Tarea 3"),
        Task("Tarea 4"),
        Task("Tarea 5")
        )

        val recyclerViewTasks: RecyclerView = findViewById(R.id.recyclerViewTasks)
        recyclerViewTasks.layoutManager = LinearLayoutManager(this)
        recyclerViewTasks.adapter = TaskAdapter(tasks)
        }
}
