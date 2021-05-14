package com.parithi.nourish

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.analytics.FirebaseAnalytics
import com.parithi.nourish.analytics.AnalyticsManager
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class NourishApp : Application() {

    @Inject
    lateinit var analytics: AnalyticsManager

    override fun onCreate() {
        super.onCreate()

        // Initialize All Analytics services
        analytics.initialize()
    }

}