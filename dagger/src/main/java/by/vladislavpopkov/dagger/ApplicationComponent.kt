package by.vladislavpopkov.dagger

import android.app.Application
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides

@Component (modules = [FuelTypeModule::class])
interface ApplicationComponent {
    fun getCar(): Car
    fun getEngine(): Engine
    fun getFuel(): Fuel

    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }
}
