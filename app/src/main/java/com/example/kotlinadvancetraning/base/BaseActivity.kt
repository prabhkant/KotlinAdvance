package com.example.kotlinadvancetraning.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject
import dagger.android.HasAndroidInjector

abstract class BaseActivity<VB: ViewDataBinding, VM: ViewModel>: AppCompatActivity(){

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    abstract fun provideViewModelClass(): Class<VM>
    abstract fun layoutId(): Int
    abstract val bindingVariable: Int

    private lateinit var viewBinding: VB
    protected lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        viewBinding = DataBindingUtil.setContentView(this, layoutId())
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(provideViewModelClass())

        viewBinding.lifecycleOwner = this
        viewBinding.setVariable(bindingVariable,viewModel)


    }

}