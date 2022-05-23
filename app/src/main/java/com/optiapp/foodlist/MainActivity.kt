package com.optiapp.foodlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.optiapp.foodlist.adapter.itemAdapter
import com.optiapp.foodlist.data.DataSource
private var isGridLayoutManager=true

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    var myDataSource=DataSource().loadDelarations()
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
         recyclerView=findViewById<RecyclerView>(R.id.foodlist)
//        recyclerView.adapter=itemAdapter(this,myDataSource)
        change()
//        recyclerView.setHasFixedSize(true)

    }
    private fun change(){
        if(isGridLayoutManager){
            recyclerView.layoutManager=GridLayoutManager(this,2)

        }
        else{
            recyclerView.layoutManager=StaggeredGridLayoutManager(3, LinearLayoutManager.HORIZONTAL)
            var toast=Toast.makeText(applicationContext,"StaggaredGrid: Swipe Left",Toast.LENGTH_LONG)
            toast.show()

        }
        recyclerView.adapter=itemAdapter(this,myDataSource)
    }
    private fun seticon(menuItem: MenuItem){
        if(menuItem==null){
            return
        }
        menuItem.icon=
            if(isGridLayoutManager)
                ContextCompat.getDrawable(this,R.drawable.ic_baseline_view_quilt_24)

            else{
                ContextCompat.getDrawable(this,R.drawable.ic_baseline_view_list_24)
            }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.layout_menu,menu)
        val layoutButton= menu?.findItem(R.id.action_switch)
        if (layoutButton != null) {
            seticon(layoutButton)
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_switch ->{
                isGridLayoutManager= !isGridLayoutManager
                change()
                seticon(item)
                return true

            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}