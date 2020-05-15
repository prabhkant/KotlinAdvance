package com.mpg.assignmentkotlin.di.component

import android.app.Application
import com.example.kotlinadvancetraning.ApplicationClass
import com.example.kotlinadvancetraning.module.ViewModelModule
import com.example.kotlinadvancetraning.module.ActivityBuilderModule
import com.mpg.assignmentkotlin.di.module.ApplicationModule
import com.mpg.assignmentkotlin.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ViewModelModule::class,
    NetworkModule::class,
    ApplicationModule::class,
    ActivityBuilderModule::class
])
interface AppComponent {

    fun inject(app: ApplicationClass)


    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        @BindsInstance
        fun application(application: Application): Builder
    }

}
