package com.example.bt_socket_mobilemouse.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.example.bt_socket_mobilemouse.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}