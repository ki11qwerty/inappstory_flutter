package com.example.inappstory_flutter
import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.TextView
import com.inappstory.sdk.stories.ui.list.StoriesList
import io.flutter.plugin.platform.PlatformView

class InAppStoryNativeView(context: Context, id: Int, creationParams: Map<String?, Any?>?) : PlatformView {
    private val inAppStory = StoriesList(context)

    override fun getView(): View {
        return inAppStory
    }

    override fun dispose() {}

    init {
        inAppStory.loadStories()
    }
}