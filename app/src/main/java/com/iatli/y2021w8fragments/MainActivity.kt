package com.iatli.y2021w8fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    fun goto_detail(view: View) {
//        val img_btn = view as ImageButton
//        val tag = img_btn.tag.toString()
//
//        //jump to detail
//        val intent = Intent(this, DetailCoinsActivity::class.java)
//        //put info
//        intent.putExtra("crypto_name", tag)
//        startActivity(intent)
//    }
}