package com.hyun.android.koinsample.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.hyun.android.koinsample.repository.CarRepository

class CarViewModel(val mainRepo: CarRepository) : ViewModel() {
    var carResult = ObservableField<String>()
    var car = mainRepo.getCar()

    fun startCar() {
        var result = car.startCar()
        carResult.set(result)
    }
}