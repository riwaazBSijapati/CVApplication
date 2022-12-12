package com.riwaaz.cvapplication.`interface`.utils.work

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.riwaaz.cvapplication.R
import com.riwaaz.cvapplication.modelclasses.Work

class WorkFragment : Fragment(R.layout.work) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val workRecyclerView: RecyclerView = view.findViewById(R.id.work_recycler_view)
        val adapter = WorkAdapter(Work.getWorkList())
        workRecyclerView.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = WorkFragment()
    }
}