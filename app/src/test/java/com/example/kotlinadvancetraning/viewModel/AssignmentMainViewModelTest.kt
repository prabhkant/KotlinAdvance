package com.example.kotlinadvancetraning.viewModel

import com.example.kotlinadvancetraning.repository.AssignmentListRepository
import org.junit.Before
import org.junit.Test

import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate

@RunWith(PowerMockRunner::class)
@PowerMockRunnerDelegate(JUnit4::class)
class AssignmentMainViewModelTest {

    private lateinit var assignmentListRepository: AssignmentListRepository
    private lateinit var viewModel: AssignmentMainViewModel

    @Before
    fun setUp() {

    }

    @Test
    fun getAssignmentListData() {
    }

    @Test
    fun getAssignmentList() {
    }
}