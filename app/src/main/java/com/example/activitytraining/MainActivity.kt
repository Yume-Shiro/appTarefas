package com.example.activitytraining

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.recycler_item.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            val intent = Intent(applicationContext, SecondActivity::class.java)
            val params = Bundle()
            val textTitle = title_d.text.toString()
            val textDescription = description.text.toString()

            params.putString("title", textTitle)
            params.putString("description", textDescription)
            intent.putExtras(params)

            startActivity(intent)

        }
    }


}
