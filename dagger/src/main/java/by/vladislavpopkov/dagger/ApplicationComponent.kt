package by.vladislavpopkov.dagger

import android.app.Application
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(modules = [FuelTypeModule::class, AppSubcomponents::class])
interface ApplicationComponent {
    fun getCar(): Car
    fun getEngine(): Engine
    fun getFuel(): Fuel

    fun getSubComponent(): SubComponent.Factory
    fun getSecondSubComponent(): SecondSubComponent.Factory

    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }
}
