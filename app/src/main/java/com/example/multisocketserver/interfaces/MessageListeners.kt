package com.example.multisocketserver.interfaces

import java.net.Socket

interface MessageListener {
    fun onMessageReceived(message: String)
    fun onClientConnected(clientSocket: Socket?)
}