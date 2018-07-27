package com.manu.samples

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        toast(""+intent.getIntExtra("data",0))

    }

    fun login(v: View){
        if(username.text.toString().toLowerCase()=="hi" && password.text.toString().toLowerCase()=="hi")
            finish()
        else
            longToast("Invalid login details")
    }

}
