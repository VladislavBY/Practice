package by.vladislavpopkov.dagger

import android.content.Context
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface SecondSubComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): SecondSubComponent
    }

    fun getTestObject(): TestObject
    fun getContext(): Context
}