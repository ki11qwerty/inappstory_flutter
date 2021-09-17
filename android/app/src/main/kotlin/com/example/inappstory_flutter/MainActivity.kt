package com.example.inappstory_flutter

import androidx.annotation.NonNull
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        flutterEngine
            .platformViewsController
            .registry
            .registerViewFactory("InAppStory", InAppStoryFactory())
        GeneratedPluginRegistrant.registerWith(flutterEngine)
    }
}
