package com.parithi.nourish.analytics

import android.content.Context
import com.google.firebase.FirebaseApp
import com.google.firebase.crashlytics.FirebaseCrashlytics
import io.branch.referral.Branch
import org.json.JSONObject
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BranchClient

class BranchService(val context: Context) : AnalyticsService {

    override fun initialize() {
        Branch.enableLogging()
        Branch.getAutoInstance(context)
    }

    override fun logEvent(name: String, properties: JSONObject) {
        FirebaseCrashlytics.getInstance().log(name)
    }

    override fun updateUserProperties(jsonObject: JSONObject) {

    }

    override fun recordException(e: Exception) {

    }
}