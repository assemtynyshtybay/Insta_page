package com.example.insta_kz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList:Array<String>
    lateinit var titleList:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        imageList = arrayOf(
//            "ice_red.jpg",
//            "montain.jpg",
//            "taj_mahal.jpg",
//            "water_nature.jpg"
//        )
//
//        titleList = arrayOf(
//            "Sunset is very beautiful",
//            "Where is calm",
//            "Almost there",
//            "Is it drinkable?"
//        )

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

//        dataList = arrayListOf<DataClass>()
//        getData()
        dataList = arrayListOf(
            DataClass(R.drawable.iceberg_sunset, "Sunset is very beautiful"),
            DataClass(R.drawable.montain, "Where is calm"),
            DataClass(R.drawable.taj_mahal, "Almost there"),
            DataClass(R.drawable.water_nature, "Is it drinkable?")
        )
        recyclerView.adapter = AdapterClass(dataList)
    }

//    private fun getData() {
//        for (i in imageList.indices){
//            val dataClass = DataClass(imageList[i], titleList[i])
//            dataList.add(dataClass)
//        }
//
//        recyclerView.adapter = AdapterClass(dataList)
//    }
}