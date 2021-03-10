package com.rvarvikar.activitylifecycle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class SecondActivity: AppCompatActivity() {
    private val TAG :String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        object {}.javaClass.enclosingMethod?.name?.let { printLog(it) }
    }
    override fun onStart() {
        super.onStart()
        object {}.javaClass.enclosingMethod?.name?.let { printLog(it) }
    }
    override fun onResume() {
        super.onResume()
        object {}.javaClass.enclosingMethod?.name?.let { printLog(it) }
    }
    override fun onPause() {
        super.onPause()
        object {}.javaClass.enclosingMethod?.name?.let { printLog(it) }
    }
    override fun onStop() {
        super.onStop()
        object {}.javaClass.enclosingMethod?.name?.let { printLog(it) }
    }
    override fun onRestart() {
        super.onRestart()
        object {}.javaClass.enclosingMethod?.name?.let { printLog(it) }
    }
    override fun onDestroy() {
        super.onDestroy()
        object {}.javaClass.enclosingMethod?.name?.let { printLog(it) }
    }
    fun printLog(methodName:String){
        Log.e(TAG,methodName)
    }
}