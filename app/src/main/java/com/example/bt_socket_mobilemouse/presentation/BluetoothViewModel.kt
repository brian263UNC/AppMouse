package com.example.bt_socket_mobilemouse.presentation

import androidx.lifecycle.ViewModel
import com.example.bt_socket_mobilemouse.chat.BluetoothDeviceDomain
import javax.inject.Inject

class BluetoothViewModel @Inject constructor(
    private val bluetoothController: BluetoothDeviceDomain
) : ViewModel() {
}