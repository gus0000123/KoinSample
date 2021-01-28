package com.hyun.android.koinsample.model

import android.util.Log

class Car(var engine: Engine) {
    var TAG = javaClass.simpleName

    fun startCar(): String {
        engine.startEngine()
        Log.d(TAG, "started Car")
        return "started Car"
    }
}