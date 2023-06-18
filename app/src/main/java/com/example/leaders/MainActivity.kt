package com.example.leaders

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var next1: Button= findViewById(R.id.next1_btn)
        val sendButton: Button = findViewById(R.id.send_button1)
        next1.setOnClickListener(){
            var i = Intent(this, MainActivity2::class.java)
            i.putExtra("2", "Rayuga")
            startActivity(i)
        }
        val purpleColor: Int = resources.getColor(R.color.purple_700)
        sendButton.setTextColor(purpleColor)
        Toast.makeText(this, "The name is Optimus Prime", Toast.LENGTH_LONG).show()
        sendButton.setOnClickListener(){

            val i  = Intent(Intent.ACTION_SEND)
            i.setType("text/plain")
            i.putExtra(Intent.EXTRA_TEXT, "Hello Buddies")
            startActivity(i)

        }

    }
}