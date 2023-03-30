package com.elnps.android_course

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elnps.android_course.recyclerView.RecyclerViewMainActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeView();
    }
    fun changeView(){
        val intent = Intent(this, RecyclerViewMainActivity::class.java )
        startActivity(intent);
    }
}