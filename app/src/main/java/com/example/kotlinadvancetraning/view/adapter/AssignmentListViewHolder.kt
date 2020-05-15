package com.mpg.assignmentkotlin.presentation.view.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinadvancetraning.databinding.RowAssignmentLayBinding
import com.example.kotlinadvancetraning.model.AssignmentModel


class AssignmentListViewHolder(private val itemBinding: RowAssignmentLayBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {

    fun bind(item: AssignmentModel) {
        itemBinding.model = item
        itemBinding.executePendingBindings()
    }

}
