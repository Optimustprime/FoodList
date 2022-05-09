package com.optiapp.foodlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.optiapp.foodlist.adapter.itemAdapter
import com.optiapp.foodlist.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        WHILE LOOP
//        var x=5
//        var y=2
//        while (x>y){
//            println("infiniteLoot")
//            it will keeep printing until the condition is violated
//        }
//        var foodList= mutableListOf<String>()
        var myDataSource=DataSource().loadDelarations()
        var recyclerView=findViewById<RecyclerView>(R.id.foodlist)
        recyclerView.adapter=itemAdapter(this,myDataSource)
        recyclerView.setHasFixedSize(true)


    }
}