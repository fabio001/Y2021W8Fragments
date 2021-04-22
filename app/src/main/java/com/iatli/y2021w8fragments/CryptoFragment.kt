package com.iatli.y2021w8fragments

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TableLayout
import android.widget.TableRow

class CryptoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_crypto, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //attach listeners for each button
        val table_layout = activity!!.findViewById<TableLayout>(R.id.table_layout)
        for (i in 0..table_layout.childCount-1){
            val row = table_layout.getChildAt(i) as TableRow
            for(j in 0 .. row.childCount-1){
                val btn = row.getChildAt(j) as ImageButton
                btn.setOnClickListener{
                    goto_detail(it)
                }
            }
        }

    }

    fun goto_detail(view: View) {
        val img_btn = view as ImageButton
        val tag = img_btn.tag.toString()

        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            //jump to detail
            val intent = Intent(activity, DetailCoinsActivity::class.java)
            //put info
            intent.putExtra("crypto_name", tag)
            startActivity(intent)
        }
        else{
            //landscape mode
            val detFragment = fragmentManager!!.findFragmentById(R.id.cryto_detail_fragment) as CryptoDetailFragment
            detFragment.displayCryto(tag)
        }
    }


}