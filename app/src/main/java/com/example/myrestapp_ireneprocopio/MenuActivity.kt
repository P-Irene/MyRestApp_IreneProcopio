package com.example.myrestapp_ireneprocopio

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        val btnSearch : ImageButton = findViewById<ImageButton>(R.id.btnSearchActivity)
        val btnWatch : ImageButton = findViewById<ImageButton>(R.id.btnWatch)
        val btnCRUD : ImageButton = findViewById<ImageButton>(R.id.btnCRUD)

        btnSearch.setOnClickListener{
            val intentSearch = Intent(this, SearchActivity::class.java).apply{}
            startActivity(intentSearch)
        }
        btnWatch.setOnClickListener{
            val intentWatch = Intent(this, WebViewActivity::class.java).apply{}
            startActivity(intentWatch)
        }
        btnCRUD.setOnClickListener{
            val toast = Toast.makeText(this, "Activity non ancora sviluppata", Toast.LENGTH_SHORT).show()
        }
    }
}