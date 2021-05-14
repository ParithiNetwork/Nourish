package com.parithi.nourish.analytics

import android.content.Context
import com.google.firebase.FirebaseApp
import com.google.firebase.crashlytics.FirebaseCrashlytics
import org.json.JSONObject
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirebaseClient

class FirebaseService(val context: Context) : AnalyticsService {

    override fun initialize() {
        FirebaseApp.initializeApp(context)
    }

    override fun logEvent(name: String, properties: JSONObject) {
        FirebaseCrashlytics.getInstance().log(name)
    }

    override fun updateUserProperties(jsonObject: JSONObject) {

    }

    override fun recordException(e: Exception) {

    }
}