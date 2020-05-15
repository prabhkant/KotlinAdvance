package com.example.kotlinadvancetraning.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.kotlinadvancetraning.BR
import com.example.kotlinadvancetraning.R
import com.example.kotlinadvancetraning.base.BaseActivity
import com.example.kotlinadvancetraning.databinding.ActivityAssignmentBinding
import com.example.kotlinadvancetraning.model.AssignmentModel
import com.example.kotlinadvancetraning.viewModel.AssignmentMainViewModel
import com.mpg.assignmentkotlin.presentation.view.adapter.AssignmentListAdapter
import kotlinx.android.synthetic.main.activity_assignment.*

class AssignmentMainActivity : BaseActivity<ActivityAssignmentBinding, AssignmentMainViewModel>() {

    override fun provideViewModelClass(): Class<AssignmentMainViewModel> = AssignmentMainViewModel::class.java

    override fun layoutId(): Int = R.layout.activity_assignment

    override val bindingVariable: Int
        get() = BR.viewModel

    private lateinit var assignmentAdapter: AssignmentListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.getAssignmentList()

        viewModel.assignmentListData.observe(this, Observer {
            assignmentAdapter = AssignmentListAdapter(it)
            recycler_view.adapter = assignmentAdapter
        })

        error_msg.setOnClickListener { viewModel.getAssignmentList() }
    }

}
