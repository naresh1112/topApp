package com.learning.topapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

  //  lateinit var toolbar: MaterialToolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
/*
        toolbar = findViewById(R.id.toolbar)

        toolbar.overflowIcon = AppCompatResources.getDrawable(this, R.drawable.baseline_more_vert_24)

        toolbar.setNavigationOnClickListener{

            Toast.makeText(this, "menu icon is clicked", Toast.LENGTH_SHORT).show()
        }

        toolbar.setOnMenuItemClickListener{ item ->

            when(item.itemId) {

                R.id.share ->  Toast.makeText(this, "Share icon is clicked", Toast.LENGTH_SHORT).show()
                R.id.edit -> Toast.makeText(this, "Edit icon is clicked", Toast.LENGTH_SHORT).show()
                R.id.settings -> Toast.makeText(this, "Settings icon is clicked", Toast.LENGTH_SHORT).show()
                R.id.notifications -> Toast.makeText(this, "Notification icon is clicked", Toast.LENGTH_SHORT).show()

            }


            return@setOnMenuItemClickListener true

        }


 */

        // Set status bar color
       // window.statusBarColor = ContextCompat.getColor(this, R.color.blue500)






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}