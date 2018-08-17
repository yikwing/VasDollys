package com.arkcloud.vasdollydemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.leon.channel.helper.ChannelReaderUtil
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val channel = ChannelReaderUtil.getChannel(applicationContext)
        channelName.text = channel
    }
}
