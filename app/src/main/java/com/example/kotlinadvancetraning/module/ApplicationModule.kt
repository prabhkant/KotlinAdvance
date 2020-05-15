package com.mpg.assignmentkotlin.di.module

import android.app.Application
import android.content.Context
import com.example.kotlinadvancetraning.ApplicationClass
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    fun provideApplication(): ApplicationClass =
        ApplicationClass()

    @Provides
    fun provideContext(application: Application): Context = application

}