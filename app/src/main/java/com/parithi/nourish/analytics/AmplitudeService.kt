package com.parithi.nourish.analytics

import android.app.Application
import android.content.Context
import com.amplitude.api.Amplitude
import com.amplitude.api.AmplitudeClient
import org.json.JSONObject
import java.lang.Exception
import javax.inject.Qualifier
import javax.inject.Singleton

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AmplitudeClient

class AmplitudeService (private val context: Context) : AnalyticsService {

    lateinit var client : AmplitudeClient

    override fun initialize() {
        client = Amplitude.getInstance().initialize(context, "ffdb978dceae6cd9a339aec4042502b2")
    }

    override fun logEvent(name: String, properties: JSONObject) {
        client.logEvent(name, properties)
    }

    override fun updateUserProperties(jsonObject: JSONObject) {

    }

    override fun recordException(e: Exception) {

    }

}

