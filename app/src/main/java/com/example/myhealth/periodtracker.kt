package com.example.myhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_periodtracker.*

class periodtracker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_periodtracker)
        var lastdate = lastdate.editableText.toString()

        submit.setOnClickListener {
            val intent = Intent(this, periodtracked::class.java)
            intent.putExtra( " lastname",lastdate)
            startActivity(intent)

        }
    }
}