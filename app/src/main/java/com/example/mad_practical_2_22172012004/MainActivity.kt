package com.example.mad_practical_2_22172012004

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val  TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate method is called")
    }
    fun showMessage(message:String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val obj:ConstraintLayout?=findViewById(R.id.mainConstrain)
        if(obj != null)
            Snackbar.make(obj,message,Snackbar.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart message is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume message is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause message in called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop message in called")
    }

}