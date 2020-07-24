package by.vladislavpopkov.dagger

import dagger.Module

@Module(subcomponents = [SubComponent::class, SecondSubComponent::class])
class AppSubcomponents