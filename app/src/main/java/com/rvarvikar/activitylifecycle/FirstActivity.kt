package com.rvarvikar.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class FirstActivity : AppCompatActivity() {
    private val TAG :String = javaClass.simpleName
    private lateinit var button1: Button
    private lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        printLog(object{}.javaClass.enclosingMethod.name)
        button1 = findViewById<Button>(R.id.button1)
        button2 = findViewById<Button>(R.id.button2)
        button1.setOnClickListener(){
            startActivity(Intent(this, SecondActivity::class.java))
        }
        button2.setOnClickListener(){
            showDialog()
        }
    }

    override fun onStart() {
        super.onStart()
        printLog(object{}.javaClass.enclosingMethod.name)
    }

    override fun onResume() {
        super.onResume()
        printLog(object{}.javaClass.enclosingMethod.name)
    }

    override fun onPause() {
        super.onPause()
        printLog(object{}.javaClass.enclosingMethod.name)
    }

    override fun onStop() {
        super.onStop()
        printLog(object{}.javaClass.enclosingMethod.name)
    }

    override fun onRestart() {
        super.onRestart()
        printLog(object{}.javaClass.enclosingMethod.name)
    }

    override fun onDestroy() {
        super.onDestroy()
        printLog(object{}.javaClass.enclosingMethod.name)
    }

    fun printLog(methodName:String){
        Log.e(TAG,methodName)
    }
    fun showDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Title")
        builder.setMessage("Message")
        builder.setPositiveButton("Okay"){dialogInterface, which ->
        }
        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }
}
