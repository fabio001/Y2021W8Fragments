package com.iatli.y2021w8fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailCoinsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_coins)

        if(intent!= null){
            val crypto_name = intent.getStringExtra("crypto_name") ?: "bitcoin"
            val img_id = resources.getIdentifier(crypto_name, "drawable", packageName)
            val detail_text_id = resources.getIdentifier(crypto_name, "raw", packageName)
            val detail_text = resources.openRawResource(detail_text_id).bufferedReader().readText()

            //put info related position
            findViewById<TextView>(R.id.txt_crypto_name).text = crypto_name
            findViewById<TextView>(R.id.txt_crypto_detail).text = detail_text
            findViewById<ImageView>(R.id.img_crypto).setImageResource(img_id)
        }
    }
}