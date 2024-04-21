package com.example.bt_socket_mobilemouse.chat

import com.example.bt_socket_mobilemouse.data.chat.BluetoothMessage

sealed interface ConnectionResult {
    object ConnectionEstablished: ConnectionResult

    data class TransferSucceeded(val message: BluetoothMessage): ConnectionResult
    data class Error(val message: String): ConnectionResult
}