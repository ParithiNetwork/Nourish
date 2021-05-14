package com.parithi.nourish.analytics

import org.json.JSONObject
import java.lang.Exception


interface AnalyticsService {
    fun initialize()
    fun logEvent(name: String, properties: JSONObject)
    fun updateUserProperties(jsonObject: JSONObject)
    fun recordException(e: Exception)
}

