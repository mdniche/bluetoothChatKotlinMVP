package com.example.mvpbtchat.model

import android.widget.Toast

class ChatModel {
    /**
     * Sends a message.
     *
     * @param message A string of text to send.
     */
    private fun sendMessage(message: String) {
        // Check that we're actually connected before trying anything
        if (mChatService.getState() != BluetoothChatService.Companion.STATE_CONNECTED) {
            Toast.makeText(activity, R.string.not_connected, Toast.LENGTH_SHORT).show()
            return
        }

        // Check that there's actually something to send
        if (message.length > 0) {
            // Get the message bytes and tell the BluetoothChatService to write
            val send = message.toByteArray()
            mChatService!!.write(send)

            // Reset out string buffer to zero and clear the edit text field
            mOutStringBuffer!!.setLength(0)
            mOutEditText!!.setText(mOutStringBuffer)
        }
    }
}