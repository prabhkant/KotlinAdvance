package com.mpg.assignmentkotlin.presentation.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinadvancetraning.R
import com.example.kotlinadvancetraning.databinding.RowAssignmentLayBinding
import com.example.kotlinadvancetraning.model.AssignmentModel


class AssignmentListAdapter(private val items: List<AssignmentModel>) : RecyclerView.Adapter<AssignmentListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AssignmentListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RowAssignmentLayBinding.inflate(inflater, parent, false)
        return AssignmentListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AssignmentListViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount(): Int = items.size

}