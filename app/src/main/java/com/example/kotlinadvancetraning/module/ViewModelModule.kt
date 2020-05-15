package com.example.kotlinadvancetraning.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinadvancetraning.viewModel.ViewModelFactory
import com.example.kotlinadvancetraning.viewModel.ViewModelKey
import com.example.kotlinadvancetraning.viewModel.AssignmentMainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
interface ViewModelModule {

    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    /*
    * This method basically says
    * inject this object into a Map using the @IntoMap annotation,
    * with the  EmptyViewModel.class as key,
    * and a Provider that will build a EmptyViewModel
    * object.
    *
    * */
    @Binds
    @IntoMap
    @ViewModelKey(AssignmentMainViewModel::class)
    fun bindEmptyViewModel(viewModel: AssignmentMainViewModel): ViewModel

   }