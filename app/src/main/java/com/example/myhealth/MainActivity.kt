package com.example.myhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_call.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            track.setOnClickListener{
                val intent = Intent(this, periodtracker::class.java)
                startActivity(intent)

        }
            map2.setOnClickListener{
                val intent = Intent( this ,MapsActivity::class.java)
                startActivity(intent)
            }
            callk.setOnClickListener{
                val intent = Intent( this,call::class.java)
                startActivity(intent)
            }
        shop.setOnClickListener{
            val intent = Intent( this,onlineshop::class.java)
            startActivity(intent)
        }
        blog.setOnClickListener{
            val intent = Intent( this,blogs::class.java)
            startActivity(intent)
        }
        dicussion.setOnClickListener{
            val intent = Intent( this,discussion::class.java)
            startActivity(intent)
        }


        }
    }