package com.iatli.y2021w8fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*


class CryptoDetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_crypto_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if(activity?.intent!= null) {
            val crypto_name = activity!!.intent.getStringExtra("crypto_name") ?: "bitcoin"
            displayCryto(crypto_name)
        }
    }

    fun displayCryto(crypto_name: String){
        val img_id = resources.getIdentifier(crypto_name, "drawable", activity!!.packageName)
        val detail_text_id = resources.getIdentifier(crypto_name, "raw", activity!!.packageName)
        val detail_text = resources.openRawResource(detail_text_id).bufferedReader().readText()

        //put info related position
        activity!!.findViewById<TextView>(R.id.txt_crypto_name).text = crypto_name
        activity!!.findViewById<TextView>(R.id.txt_crypto_detail).text = detail_text
        activity!!.findViewById<ImageView>(R.id.img_crypto).setImageResource(img_id)

    }

}