package com.parithi.nourish.di

import android.content.Context
import com.parithi.nourish.analytics.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AnalyticsModule {

    @AmplitudeClient
    @Provides
    @Singleton
    fun providesAmplitude(@ApplicationContext context: Context) : AnalyticsService {
        return AmplitudeService(context)
    }

    @FirebaseClient
    @Provides
    @Singleton
    fun providesFirebase(@ApplicationContext context: Context) : AnalyticsService {
        return FirebaseService(context)
    }

    @BranchClient
    @Provides
    @Singleton
    fun providesBranch(@ApplicationContext context: Context) : AnalyticsService {
        return BranchService(context)
    }

}