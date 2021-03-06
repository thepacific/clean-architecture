package com.pacific.guava.android.mvvm.dagger

import androidx.lifecycle.ViewModelProvider
import com.pacific.guava.android.mvvm.lifecycle.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class FeatureScopeViewModelFactoryBinder {

    @Binds
    @FeatureScope
    abstract fun provideViewModelFactory(it: ViewModelFactory): ViewModelProvider.Factory
}