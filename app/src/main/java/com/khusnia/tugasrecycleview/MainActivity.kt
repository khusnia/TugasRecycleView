package com.khusnia.tugasrecycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.khusnia.tugasrecycleview.AlphaAdapters
import com.khusnia.tugasrecycleview.CharItem

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var charItem: ArrayList<CharItem>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var alphaAdapters: AlphaAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        charItem = ArrayList()
        charItem = setAlphas()
        alphaAdapters = AlphaAdapters(applicationContext, charItem!!)
        recyclerView?.adapter = alphaAdapters

    }

    private fun setAlphas(): ArrayList<CharItem> {

        var arrayList: ArrayList<CharItem> = ArrayList()

        arrayList.add(CharItem(R.drawable.letter_a, "Huruf A"))
        arrayList.add(CharItem(R.drawable.letter_b, "Huruf B"))
        arrayList.add(CharItem(R.drawable.letter_c, "Huruf C"))
        arrayList.add(CharItem(R.drawable.letter_d, "Huruf D"))
        arrayList.add(CharItem(R.drawable.letter_e, "Huruf E"))
        arrayList.add(CharItem(R.drawable.letter_f, "Huruf F"))
        arrayList.add(CharItem(R.drawable.letter_g, "Huruf G"))
        arrayList.add(CharItem(R.drawable.letter_h, "Huruf H"))
        arrayList.add(CharItem(R.drawable.letter_i, "Huruf I"))
        return arrayList
    }

}
