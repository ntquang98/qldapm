package com.example.measurehearthrate.Dagger.Module

import com.example.measurehearthrate.View.SignUpFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector (
            modules = [SignUpModule::class]
    )
    abstract fun contributeSignUpFragment() : SignUpFragment
}