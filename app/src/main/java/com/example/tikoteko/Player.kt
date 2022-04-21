package com.example.tikoteko

import android.content.Context
import android.net.Uri
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util

class Player {
    internal class Builder(private val context: Context, private val media: String) {
        fun build(): SimpleExoPlayer{
            val player = SimpleExoPlayer.Builder(context).build().apply {
                val factory = DefaultDataSourceFactory(
                    context,
                    Util.getUserAgent(context, context.packageName)
                )
                val source = ProgressiveMediaSource
                    .Factory(factory)
                    .createMediaSource(Uri.parse(media))
                prepare(source)
            }

            player.playWhenReady = true
            return player
        }
    }
}