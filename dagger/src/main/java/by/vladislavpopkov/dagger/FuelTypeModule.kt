package by.vladislavpopkov.dagger

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class FuelTypeModule{
    @Provides
    fun provideFuelType(context: Context): FuelDataInt{
        return FuelData("test" + context.packageName)
    }
}