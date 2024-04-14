package com.example.bt_socket_mobilemouse.chat

import android.bluetooth.BluetoothDevice

typealias BluetoothDeviceDomain  = BluetoothDevice
data class BluetoothDevice(
    val name: String?,
    val address: String
)
