package com.example.myhealth

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_onlineshop.*

class onlineshop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onlineshop)

        netmed.setOnClickListener{
            val url = "https://www.netmeds.com/"
            val intent = Intent (Intent.ACTION_VIEW, Uri.parse(url ))
            startActivity(intent)
        }

        appolopharmacy.setOnClickListener {
            val url = "https://www.apollopharmacy.in/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

       onemg.setOnClickListener {
            val url = "https://www.1mg.com/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        pharmeasy.setOnClickListener {
            val url = "https://pharmeasy.in/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }
}