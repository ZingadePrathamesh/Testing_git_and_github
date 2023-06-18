package com.example.leaders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val bundle: Bundle?= intent.extras
        val image = bundle?.get("5")
        Toast.makeText(this, "The name is $image", Toast.LENGTH_LONG).show()

    }
}