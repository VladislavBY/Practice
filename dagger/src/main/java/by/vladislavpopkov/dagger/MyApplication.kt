package by.vladislavpopkov.dagger

import android.app.Application
//<manifest>
//<application
//android:name=".MyApplication">
//</application>
//</manifest>
open class MyApplication : Application() {

    val appComponent: ApplicationComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent() =
        DaggerApplicationComponent.factory().create(applicationContext)
}