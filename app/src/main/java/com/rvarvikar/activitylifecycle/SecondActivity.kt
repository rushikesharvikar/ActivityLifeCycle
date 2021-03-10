package com.rvarvikar.activitylifecycle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class SecondActivity: AppCompatActivity() {
    private



























    val TAG :String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        printLog(object{}.javaClass.enclosingMethod.name)
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
}