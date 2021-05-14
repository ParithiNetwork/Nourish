package com.parithi.nourish.analytics

import org.json.JSONObject
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnalyticsManager @Inject constructor(@AmplitudeClient var amplitudeClient : AnalyticsService, @FirebaseClient var firebaseClient : AnalyticsService, @BranchClient var branchClient: AnalyticsService) {

    var analyticsServices: List<AnalyticsService> = listOf(amplitudeClient, firebaseClient, branchClient)

    fun initialize() {
        analyticsServices.forEach {
            it.initialize()
        }
    }

    fun logEvent(s: String) {
        analyticsServices.forEach {
            it.logEvent(s, JSONObject())
        }
    }

}
