package by.vladislavpopkov.dagger

import android.content.Context
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface SubComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): SubComponent
    }

    @ActivityScope
    fun getTestObject(): TestObject
    fun getContext(): Context
}