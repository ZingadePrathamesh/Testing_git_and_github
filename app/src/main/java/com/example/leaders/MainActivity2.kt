package com.example.leaders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var next2: Button = findViewById(R.id.next2_btn2)
        next2.setOnClickListener(){
            var i = Intent(this, MainActivity3::class.java)
            i.putExtra("3", "Miyamoto Musashi")
            startActivity(i)
        }
        val bundle: Bundle?= intent.extras
        val image = bundle?.get("2")
        Toast.makeText(this, "The name is $image", Toast.LENGTH_LONG).show()

    }
}