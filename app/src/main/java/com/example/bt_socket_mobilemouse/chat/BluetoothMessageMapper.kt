package com.example.bt_socket_mobilemouse.chat

import com.example.bt_socket_mobilemouse.data.chat.BluetoothMessage
import com.example.bt_socket_mobilemouse.presentation.BluetoothUI

fun String.toBluetoothMessage(isFromLocalUser: Boolean): BluetoothMessage {
    val name = substringBeforeLast("#")
    val message = substringAfter("#")
    return BluetoothMessage(
        message = message,
        senderName = name,
        isFromLocalUser = isFromLocalUser
    )
}

fun BluetoothMessage.toByteArray(): ByteArray {
    return "$senderName#$message".encodeToByteArray()
}