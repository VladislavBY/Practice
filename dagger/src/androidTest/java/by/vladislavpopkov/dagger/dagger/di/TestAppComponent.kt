package by.vladislavpopkov.dagger.dagger.di

import by.vladislavpopkov.dagger.AppSubcomponents
import by.vladislavpopkov.dagger.ApplicationComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestFuelTypeModule::class, AppSubcomponents::class])
interface TestAppComponent : ApplicationComponent