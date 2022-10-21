package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentlifecycle.databinding.FragmentDetailBinding
import com.example.fragmentlifecycle.databinding.FragmentListBinding


class ListFragment : Fragment() {
	var mainActivity: MainActivity? = null
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val binding =FragmentListBinding.inflate(inflater, container, false)
		binding.btnNext.setOnClickListener { mainActivity?.goDetail() }
		return binding.root
	}

	override fun onAttach(context: Context) {
		super.onAttach(context)

		if(context is MainActivity) 	mainActivity = context
	}
}