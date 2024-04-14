package com.example.bt_socket_mobilemouse.presentation

import com.example.bt_socket_mobilemouse.chat.BluetoothDeviceDomain

data class BluetoothUI(
    val scannedDevices: List<BluetoothDeviceDomain> = emptyList(),
    val pairedDevices: List<BluetoothDeviceDomain> = emptyList(),
)
