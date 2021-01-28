package com.hyun.android.koinsample.repository

import com.hyun.android.koinsample.model.Car

class CarRepositoryImpl(car: Car) : CarRepository {
    var TAG = javaClass.simpleName
    val mCar: Car = car

    override fun getCar(): Car {
        //get Car class from Room Database or Retrofit
        //but we don't have any Room Database and Retrofit
        //then I received Car class from Model class

        return mCar
    }
}