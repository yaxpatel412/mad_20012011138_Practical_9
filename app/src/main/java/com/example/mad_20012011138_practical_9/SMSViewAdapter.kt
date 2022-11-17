package com.example.mad_20012011138_practical_9

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.mad_20012011138_practical_9.databinding.SmsItemViewBinding


class SMSViewAdapter (context: Context, private val array:ArrayList<SMSView>):
    ArrayAdapter<SMSView>(context,array.size,array){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val currentSms:SMSView?=getItem(position)
        val binding= SmsItemViewBinding.inflate(LayoutInflater.from(context))
        binding.textviewPhoneNo.text=currentSms!!.phoneno
        binding.textviewMessage.text=currentSms!!.message
        return binding.root
    }
}