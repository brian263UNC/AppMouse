package com.example.bt_socket_mobilemouse.di

import android.content.Context
import com.example.bt_socket_mobilemouse.chat.IBluetoothController
import com.example.bt_socket_mobilemouse.data.chat.AndroidBluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBluetoothController(@ApplicationContext context : Context): IBluetoothController{
        return AndroidBluetoothController(context)
    }

}