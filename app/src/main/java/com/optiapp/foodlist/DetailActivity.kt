package com.optiapp.foodlist

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.optiapp.foodlist.R
import com.optiapp.foodlist.model.Declaration

class DetailActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        var image=findViewById<ImageView>(R.id.imageView)
        var text=findViewById<TextView>(R.id.textView2)

//        var item = listOf<String>(List<Declaration>)
//        Log.v("test1",item.stringResource.toString())
        val letter= intent?.extras?.getString("letter").toString()
        val code = intent?.extras?.getInt("code")
        Log.v("test1",code.toString())
//
        if (code != null) {
            image.setImageResource(code)
        }
        if(letter=="0"){
            text.setText("Juicy Jollof rice, Fried Chicken and Fried Plantain finished With our Special Source. The Original Simple favourite")

        }
        else{
            text.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Quis ipsum suspendisse ultrices gravida. Risus commodo viverra maecenas accumsan lacus vel facilisis")
        }

    }
}