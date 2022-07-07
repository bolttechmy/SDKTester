package com.example.sdktester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.okhttptest.MainActivity

class ClientMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_main)

        findViewById<Button>(R.id.btn_launch_sdk).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}