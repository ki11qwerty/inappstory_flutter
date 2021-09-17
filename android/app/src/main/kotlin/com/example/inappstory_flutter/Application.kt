package com.example.inappstory_flutter

import com.inappstory.sdk.InAppStoryManager
import com.inappstory.sdk.exceptions.DataException
import io.flutter.app.FlutterApplication
import io.flutter.view.FlutterMain

class Application : FlutterApplication() {
    private val USER_ID = "cs_default_user"

    override fun onCreate() {
        super.onCreate()
        initInAppStory()
        FlutterMain.startInitialization(this)
    }

    private fun initInAppStory(){
        try {
            InAppStoryManager.Builder()
                .userId(USER_ID)
                .context(applicationContext)
                .create()
        } catch (e: DataException) {
            return
        }
    }
}
