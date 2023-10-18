package com.example.zenatapos.util

import android.app.Application
import com.example.zenatapos.core.di.appModule
import com.example.zenatapos.core.di.repositiryModule
import com.example.zenatapos.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule, viewModelModule, repositiryModule))
        }
    }
}