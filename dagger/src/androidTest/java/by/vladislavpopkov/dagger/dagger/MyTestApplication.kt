package by.vladislavpopkov.dagger.dagger

import androidx.test.espresso.DaggerBaseLayerComponent
import by.vladislavpopkov.dagger.ApplicationComponent
import by.vladislavpopkov.dagger.MyApplication

class MyTestApplication : MyApplication() {
    override fun initializeComponent(): ApplicationComponent {
        DaggerTestAppComponent
    }
}