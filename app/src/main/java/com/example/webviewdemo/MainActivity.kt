package com.example.webviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    var webView: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewById<WebView>(R.id.webView)
        webView!!.settings.javaScriptEnabled = true
//        enable only when you know why you do it
        webView!!.settings.allowFileAccessFromFileURLs = true
        webView!!.settings.allowFileAccess = true
        loadLocalHtml()
//        loadLocalhost()
    }

    private fun loadLocalHtml() {
        webView!!.loadUrl("file:///android_asset/index.html")
    }

    private fun loadLocalhost() {
        // 10.0.2.2 is localhost in Android emulator
        webView!!.loadUrl("http://10.0.2.2:8000")
    }
}