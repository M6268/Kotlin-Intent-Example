package com.manu.samples

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gotoNext(view: View)
    {
        toast("Test toast with anko")
        startActivity(intentFor<SecondActivity>("data" to 25))
        //startActivity(Intent(this,SecondActivity::class.java))

    }
}
