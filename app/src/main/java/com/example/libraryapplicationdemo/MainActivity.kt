package com.example.libraryapplicationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logging_app.LoggingHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LoggingHelper.ENABLE_LOGS = false
        LoggingHelper().printErrorLog("Test Error logs")
        LoggingHelper().printDebugLog("Test Debug logs")
    }
}