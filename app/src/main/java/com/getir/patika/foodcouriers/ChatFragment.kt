package com.getir.patika.foodcouriers

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment

class ChatFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val messageEditText = view.findViewById<EditText>(R.id.editTextMessage)
        val sendButton = view.findViewById<ImageButton>(R.id.sendButton)

        // Debug: Confirm this part is reached
        Log.d("ChatFragment", "Setting up click listener")

        sendButton.setOnClickListener {
            // Debug: Confirm click
            Log.d("ChatFragment", "Send button clicked")

            // Directly testing sendMessage functionality with hardcoded values
            sendMessage(requireContext(), "Test message")
            messageEditText.text.clear() // Clearing text for testing
        }
    }

    private fun sendMessage(context: Context, message: String) {
        // Debug: Check message processing
        Log.d("ChatFragment", "Sending message: $message")

        // Attempt to display a Toast with a hardcoded message
        Toast.makeText(context, "Test: $message", Toast.LENGTH_SHORT).show()
    }

}