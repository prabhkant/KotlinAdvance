package com.example.kotlinadvancetraning.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.kotlinadvancetraning.repository.AssignmentListRepository
import com.example.kotlinadvancetraning.model.ResultError
import com.example.kotlinadvancetraning.model.ResultSuccess
import com.example.kotlinadvancetraning.base.BaseViewModel
import com.example.kotlinadvancetraning.model.AssignmentModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class AssignmentMainViewModel @Inject constructor(private val assignmentListRepository: AssignmentListRepository)
    : BaseViewModel() {

    val assignmentListData: MutableLiveData<List<AssignmentModel>> = MutableLiveData()

    fun getAssignmentList() {
        loading.postValue(true)
        isError.postValue(false)
        viewModelScope.launch {
            when (val result = assignmentListRepository.getAssignment()) {
                is ResultSuccess -> {
                    loading.postValue(false)
                    isError.postValue(false)
                    assignmentListData.postValue(result.data)
                }
                is ResultError -> {
                    loading.postValue(false)
                    isError.postValue(true)
                }
            }
        }
    }

}