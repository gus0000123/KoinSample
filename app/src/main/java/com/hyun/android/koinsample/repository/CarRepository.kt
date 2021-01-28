package com.hyun.android.koinsample.repository

import com.hyun.android.koinsample.model.Car

interface CarRepository {
    fun getCar(): Car
}