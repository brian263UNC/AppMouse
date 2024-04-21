package com.example.bt_socket_mobilemouse.data.chat

import android.bluetooth.BluetoothSocket
import com.example.bt_socket_mobilemouse.chat.ConnectionResult
import com.example.bt_socket_mobilemouse.chat.TransferFailedException
import com.example.bt_socket_mobilemouse.chat.toBluetoothMessage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import java.io.IOException

class BluetoothDataTransferService(
    private val socket: BluetoothSocket
) {
    fun listenForIncomingMessages(): Flow<BluetoothMessage>  {
        return flow {
            if(!socket.isConnected) { return@flow }
            val buffer = ByteArray(1024)
            while (true) {
                val byteCount = try {
                    socket.inputStream.read(buffer)
                } catch (_: IOException) {
                    throw TransferFailedException()
                }
                emit(
                    buffer.decodeToString(
                        endIndex = byteCount
                    ).toBluetoothMessage(
                        isFromLocalUser = false
                    )
                )
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun sendMessage(bytes: ByteArray): Boolean {
        return withContext(Dispatchers.IO){
            try {
                socket.outputStream.write(bytes)
            } catch (_ :IOException){
                return@withContext false
            }
            true
        }
    }
}