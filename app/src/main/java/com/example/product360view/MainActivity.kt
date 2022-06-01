package com.example.product360view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val wv = findViewById<View>(R.id.web_view) as Product360DegreeWebView

        var imagesTag360 = ""

        /*Taking images from the assert folder*/for (i in 1..18) {
            imagesTag360 = "$imagesTag360<img src=\"file:///android_asset/images/image1_$i.jpg\"/>"
        }
        wv.loadDataWithBaseURL(
            "",
            imagesTag360, "text/html", "UTF-8", null
        )
    }
}