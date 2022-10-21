package com.example.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		setFragment()
	}
	fun setFragment() {
		// 엑티비티에 미리 생성해 놓은 프레그먼트 (ListFragment)를 삽입시키는 함수
		val listFragment: ListFragment = ListFragment()

		val trans = supportFragmentManager.beginTransaction()
		// 트렌젝션 객체 생성 후 트렌잭션 시작
		trans.add(R.id.frameLayout, listFragment)
		// add(레이아웃, 프레그먼트) : 지정한 프레그먼트를 지정한 프레그먼트 레이아웃 객체의 위치에 추가
		// replace(레이아웃, 프레그먼트) : 지정한 프레그먼트 레이아웃 객체에 있는 기존 프레그먼트를 지정한 새 프레그먼트로 교체
		// remove(프레그먼트) : 지정한 프레그먼트 삭제
		trans.commit()
	}

	fun goDetail(){
		val detailFragment: DetailFragment = DetailFragment()

		val trans = supportFragmentManager.beginTransaction()
		trans.add(R.id.frameLayout, detailFragment)
		trans.addToBackStack("detail")
		trans.commit()
	}

	fun goBack(){
		onBackPressed()
	}

}