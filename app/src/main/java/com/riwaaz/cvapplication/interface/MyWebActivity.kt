package com.riwaaz.cvapplication.`interface`

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.riwaaz.cvapplication.R

class MyWebActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_web)

        val urlToBeLoaded = intent.getStringExtra("url")

        webView = findViewById(R.id.web_view)
        webView.webViewClient = WebViewClient()
        webView.loadUrl(urlToBeLoaded!!)

        // this will enable the javascript settings, it can also allow xss vulnerabilities
        webView.settings.javaScriptEnabled = true
//
//        // if you want to enable zoom feature
//        webView.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        if (webView.canGoBack())
            webView.goBack()
        else
            super.onBackPressed()
    }
}