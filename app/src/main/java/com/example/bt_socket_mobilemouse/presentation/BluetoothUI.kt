package com.example.bt_socket_mobilemouse.presentation

import com.example.bt_socket_mobilemouse.chat.BluetoothDeviceDomain
import com.example.bt_socket_mobilemouse.data.chat.BluetoothMessage

data class BluetoothUI(
    val scannedDevices: List<BluetoothDeviceDomain> = emptyList(),
    val pairedDevices: List<BluetoothDeviceDomain> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMessage: String? = null,
    val messages: List<BluetoothMessage> = emptyList()
)
