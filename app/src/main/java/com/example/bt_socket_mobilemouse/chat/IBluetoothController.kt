package com.example.bt_socket_mobilemouse.chat

import kotlinx.coroutines.flow.StateFlow

interface IBluetoothController {
    val scannedDevices: StateFlow<List<BluetoothDeviceDomain>>
    val pairedDevices: StateFlow<List<BluetoothDeviceDomain>>

    fun startDiscovery()
    fun stopDiscovery()
    fun release()
}