package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentlifecycle.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
	var mainActivity: MainActivity = MainActivity()

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		val binding = FragmentDetailBinding.inflate(inflater, container, false)
		binding.btnBack.setOnClickListener { mainActivity.goBack() }
		return binding.root
	}

	override fun onAttach(context: Context) {
		super.onAttach(context)

		if(context is MainActivity)		mainActivity = context
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		Log.d("fragTest", "detail onCreate() 실행")
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		Log.d("fragTest", "detail onViewCreated() 실행")
	}

	override fun onStart() {
		super.onStart()
		Log.d("fragTest", "detail onStart() 실행")
	}

	override fun onPause() {
		super.onPause()
		Log.d("fragTest", "detail onPause() 실행")
	}

	override fun onStop() {
		super.onStop()
		Log.d("fragTest", "detail onStop() 실행")
	}

	override fun onDestroyView() {
		super.onDestroyView()
		Log.d("fragTest", "detail onDestroyView() 실행")
	}

	override fun onDestroy() {
		super.onDestroy()
		Log.d("fragTest", "detail onDestroy() 실행")
	}

	override fun onDetach() {
		super.onDetach()
		Log.d("fragTest", "detail onDetach() 실행")
	}
}