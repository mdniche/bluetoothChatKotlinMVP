package com.example.mvpbtchat.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import com.example.mvpbtchat.R
import com.example.mvpbtchat.interfaces.ChatInterface
import com.example.mvpbtchat.presenter.MainActivityPresenter

class MainActivity : AppCompatActivity(), ChatInterface.DataView {
    //Declare components
    val chatLst = findViewById<ListView>(R.id.chatLst)
    val sendBtn = findViewById<Button>(R.id.sendBtn)

    private var mainPresenter : MainActivityPresenter? = null

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainActivityPresenter(this)
    }

    override fun initView() {
        val activity = activity ?: return
        mConversationArrayAdapter = ArrayAdapter(activity, R.layout.message)
        chatLst!!.adapter = conversationArrayAdapter

        sendBtn.setOnClickListener {
            mainPresenter?.sendChat()
        }
    }

    override fun updateView() {
        TODO("Not yet implemented")
    }

    override fun connectionStatus() {

    }
}