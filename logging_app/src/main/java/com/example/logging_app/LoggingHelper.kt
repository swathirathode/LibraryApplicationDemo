package com.example.logging_app

import android.util.Log

class LoggingHelper {

    companion object{
        private val TAG = LoggingHelper::class.java.simpleName //LogginHelper"
         var ENABLE_LOGS = false
    }

    fun printErrorLog(message: String){
        if(ENABLE_LOGS) {
            Log.e(TAG, message)
        }
    }

    fun printDebugLog(message: String){
        if(ENABLE_LOGS) {
            Log.d(TAG, message)
        }
    }


}