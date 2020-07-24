package by.vladislavpopkov.dagger.dagger.di

import android.content.Context
import by.vladislavpopkov.dagger.FuelData
import by.vladislavpopkov.dagger.FuelDataInt
import dagger.Module
import dagger.Provides

@Module
class TestFuelTypeModule {

    @Provides
    fun provideFuelType(): FuelDataInt {
        return FuelData("AndroidTest")
    }

}