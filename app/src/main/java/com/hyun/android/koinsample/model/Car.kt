package com.hyun.android.koinsample.model

import android.util.Log

class Car(var engine: Engine, var bonnet: Bonnet, var handle: Handle, var tier: Tier) {
    var TAG = javaClass.simpleName

    fun startCar(): String {
        engine.startEngine()
        bonnet.doingSomething()
        handle.doingSomething()
        tier.doingSomething()

        Log.d(TAG, "started Car")
        return "started Car"
    }
}