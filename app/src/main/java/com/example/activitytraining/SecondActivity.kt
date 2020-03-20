package com.example.activitytraining

import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_second.view.*
import kotlinx.android.synthetic.main.recycler_item.*


class SecondActivity : AppCompatActivity() {

    companion object{
        val list = mutableListOf<Task>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val layoutManager = LinearLayoutManager(this, VERTICAL, false)
        recycler.layoutManager = layoutManager

        val rTitle = intent.getStringExtra("title")
        val rDescription = intent.getStringExtra("description")

        val task = Task(rTitle!!, rDescription!!)
        list.add(task)

        recycler.adapter = TaskListAdapter(list, this)

//        btn_remove.setOnClickListener {
//            Toast.makeText(applicationContext, "botão clicado", Toast.LENGTH_LONG).show()
//
//        }
    }
}
