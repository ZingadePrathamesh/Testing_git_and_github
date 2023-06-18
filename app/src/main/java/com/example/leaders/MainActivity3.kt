package com.example.leaders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var next3: Button = findViewById(R.id.next3_btn)
        next3.setOnClickListener(){
            var i = Intent(this, MainActivity4::class.java)
            i.putExtra("4", "Manjiro san")

            startActivity(i)
        }
        val bundle: Bundle?= intent.extras
        val image = bundle?.get("3")
        Toast.makeText(this, "The name is $image", Toast.LENGTH_LONG).show()
    }
}