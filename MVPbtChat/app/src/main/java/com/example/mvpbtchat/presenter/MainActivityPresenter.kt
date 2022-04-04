package com.example.mvpbtchat.presenter

import com.example.mvpbtchat.interfaces.ChatInterface
import com.example.mvpbtchat.model.ChatModel
import com.example.mvpbtchat.model.MainActivityModel

class MainActivityPresenter(view : ChatInterface.DataView) : ChatInterface.Presenter {
    private var view : ChatInterface.DataView = view
    private var model : ChatInterface.DataModel = MainActivityModel()
    private var sendChat : ChatInterface.Presenter = ChatModel()
    private var connectModel : ChatInterface.Presenter = BluetoothConnectModel()


    init {
        view.initView()
    }

    override fun receiveChat() {
        view.updateView()
    }

    override fun sendChat() {
        sendChat.sendChat()
    }

    override fun connectDevice() {
        TODO("Not yet implemented")
    }

    override fun scanDevice() {
        TODO("Not yet implemented")
    }
}