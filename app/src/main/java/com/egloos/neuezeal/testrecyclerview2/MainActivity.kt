package com.egloos.neuezeal.testrecyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sampleList = listOf(
            SampleModel(R.drawable.img1, "딸기"),
            SampleModel(R.drawable.img2, "민주"),
            SampleModel(R.drawable.img3, "정모"),
            SampleModel(R.drawable.img4, "오렌지"),
            SampleModel(R.drawable.img5, "민지"),
            SampleModel(R.drawable.img6, "혜림")

        )

        var adapter = SampleAdapter(sampleList, R.layout.item_box_3)
        sampleListView.adapter = adapter

        sampleListView.layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
    }
}
