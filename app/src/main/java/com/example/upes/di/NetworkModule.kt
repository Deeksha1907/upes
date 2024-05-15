package com.example.sharesphere.di

import com.example.upes.api.CyberStrikeApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
companion object{
    const val BASE_URL="http://mvprv599-8000.inc1.devtunnels.ms/"
}


    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    @Singleton
    @Provides
    fun providesCyberStrikeInterface(retrofit: Retrofit): CyberStrikeApi {
        return retrofit.create(CyberStrikeApi::class.java)
    }




}