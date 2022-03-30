package com.example.myhealth

import android.content.Intent
import android.net.Uri
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_call.*
import java.net.URI
import java.util.logging.Level.parse

class call : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)
           dial.setOnClickListener{
                val phNo =etphNo.text.toString()
                 val intent = Intent (Intent.ACTION_DIAL, Uri.parse("tel:$phNo" ))
               startActivity(intent)
           }



    }
}