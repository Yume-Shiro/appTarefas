package com.example.activitytraining

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_item.view.*

class TaskListAdapter (private val tasks: MutableList<Task>, private val context: Context) : RecyclerView.Adapter<TaskListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tasks.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val task = tasks[position]

        holder.title.text = task.title
        holder.description.text = task.description
        holder.button.setOnClickListener {

            tasks.remove(tasks[position])
            notifyDataSetChanged()

        }

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title: TextView = itemView.title_task
        val description: TextView = itemView.description_task
        val button: Button = itemView.btn_remove

    }

    fun itemRemove(position: Int){



    }

}