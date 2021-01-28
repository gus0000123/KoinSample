package com.hyun.android.koinsample

import android.app.Application
import com.hyun.android.koinsample.model.*
import com.hyun.android.koinsample.repository.CarRepository
import com.hyun.android.koinsample.repository.CarRepositoryImpl
import com.hyun.android.koinsample.viewmodel.CarViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

/**
 * Main Application
 */
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // start Koin context
        startKoin {
            androidContext(this@MainApplication)
            androidLogger()
            modules(localDataModule, repoModule, viewModelModule)
        }
    }
}

val localDataModule = module {
    factory { Engine(); Bonnet(); Handle(); Tier() }
    factory { Car(get(), get(), get(), get()) }
}

val repoModule = module {
    single<CarRepository> {
        CarRepositoryImpl(get())
    }
}

val viewModelModule = module {
    viewModel {
        CarViewModel(get())
    }
}