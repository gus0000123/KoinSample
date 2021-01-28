package com.hyun.android.koinsample

import com.hyun.android.koinsample.model.Car
import com.hyun.android.koinsample.model.Engine
import com.hyun.android.koinsample.repository.CarRepository
import com.hyun.android.koinsample.repository.CarRepositoryImpl
import com.hyun.android.koinsample.viewmodel.CarViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val localDataModule = module {
    factory { Engine() }
    factory { Car(get()) }
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