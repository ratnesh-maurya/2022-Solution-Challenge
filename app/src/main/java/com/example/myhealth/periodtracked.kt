package com.example.myhealth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_periodtracked.*

class periodtracked : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_periodtracked)
         val data = intent.getStringExtra("lastname" )
        daysleft.text="                  24         Days Left "
    }
}