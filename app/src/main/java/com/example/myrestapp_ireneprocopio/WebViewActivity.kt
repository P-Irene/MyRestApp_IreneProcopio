package com.example.myrestapp_ireneprocopio

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_web_view)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        /*val myWebView = WebView(applicationContext)
        myWebView.settings.javaScriptEnabled = true
        setContentView(myWebView)
        myWebView.loadUrl("")*/
        val webView = findViewById<WebView>(R.id.idWebview)
        webView.loadUrl("https://www.netflix.com/")
    }
}