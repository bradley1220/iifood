package com.example.ifood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class konyagi : AppCompatActivity() {
    lateinit var pay: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konyagi)

        pay = findViewById(R.id.mBtnbuynow)

        pay = findViewById(R.id.mBtnbuynow)
        pay.setOnClickListener {
            val intent = Intent(this, modeofpayment::class.java)
            startActivity(intent)
            Toast.makeText(this@konyagi, "Success", Toast.LENGTH_LONG).show()
        }
    }}



