package com.example.kotlinadvancetraning

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.mpg.assignmentkotlin.di.component.DaggerAppComponent
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class ApplicationClass: Application() , HasAndroidInjector{

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder().application(this)
            .build().inject(this)

//        registerActivityLifecycleCallbacks(object: ActivityLifecycleCallbacks {
//            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
//                AndroidInjection.inject(activity)
//            }
//
//            override fun onActivityStarted(activity: Activity) {
//                // Nothing goes here
//            }
//
//            override fun onActivityResumed(activity: Activity) {
//                // Nothing goes here
//            }
//
//            override fun onActivityPaused(activity: Activity) {
//                // Nothing goes here
//            }
//
//            override fun onActivityStopped(activity: Activity) {
//                // Nothing goes here
//            }
//
//            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle?) {
//                // Nothing goes here
//            }
//
//            override fun onActivityDestroyed(activity: Activity) {
//                // Nothing goes here
//            }
//        })

    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }


}