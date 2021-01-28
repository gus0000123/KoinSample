package com.hyun.android.koinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hyun.android.koinsample.databinding.ActivityMainBinding
import com.hyun.android.koinsample.viewmodel.CarViewModel
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    val carVM: CarViewModel by inject()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        carVM.startCar()

        binding.viewmodel = carVM
    }
}

