package com.hyun.android.koinsample

import android.util.Log

class Car(var engine: Engine) {
    var TAG = javaClass.simpleName

    fun startCar() {
        Log.d(TAG, "start Car")
        engine.start()
    }
}