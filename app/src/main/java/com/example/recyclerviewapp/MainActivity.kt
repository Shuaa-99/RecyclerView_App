package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val myMessage = ArrayList<String>()
    private lateinit var button_click: Button
    private lateinit var txt_Enter: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_Enter = findViewById(R.id.editText_item)
        button_click = findViewById(R.id.btn_click)

        button_click.setOnClickListener {
            if (txt_Enter.text != null)
                myMessage.add(txt_Enter.text.toString())
                val myRV = findViewById<RecyclerView>(R.id.myRecyclerView)
                myRV.adapter = RecyclerViewAdapter(myMessage)
                myRV.layoutManager = LinearLayoutManager(this)
                txt_Enter.text = null
        }
    }
}
