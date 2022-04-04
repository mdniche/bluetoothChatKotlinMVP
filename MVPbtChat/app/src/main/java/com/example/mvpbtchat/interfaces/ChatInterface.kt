package com.example.mvpbtchat.interfaces

interface ChatInterface {
    interface DataView {
        fun initView()
        fun updateView()
        fun connectionStatus()
    }

    interface Presenter {
        fun receiveChat()
        fun sendChat()
        fun connectDevice() // connect to paired BT devices
        fun scanDevice() // scan for BT devices
    }

    interface DataModel {
        fun logChat()
    }
}