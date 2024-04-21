package com.example.bt_socket_mobilemouse.chat

import java.io.IOException

class TransferFailedException: IOException("Failed to read incoming data from bluetooth socket!")