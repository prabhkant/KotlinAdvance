package com.example.kotlinadvancetraning.module


import com.example.kotlinadvancetraning.view.AssignmentMainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@SuppressWarnings("unused")
@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeAssignmentMainActivity() : AssignmentMainActivity



}