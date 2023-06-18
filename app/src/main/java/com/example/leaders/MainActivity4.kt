package com.example.leaders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var next4: Button = findViewById(R.id.next4_btn)
        next4.setOnClickListener(){
            var i = Intent(this, MainActivity5::class.java)
            i.putExtra("5", "Leonidas")

            startActivity(i)
        }
        val bundle: Bundle?= intent.extras
        val image = bundle?.get("4")
        Toast.makeText(this, "The name is $image", Toast.LENGTH_LONG).show()

    }
}