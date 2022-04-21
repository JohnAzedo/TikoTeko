package com.example.tikoteko.infra

import com.example.tikoteko.domain.Video
import com.example.tikoteko.domain.VideosRepository

class MockVideoRepository: VideosRepository{
    override fun getVideos(): List<Video> {
        return listOf(
            Video("https://assets.mixkit.co/videos/preview/mixkit-waves-in-the-water-1164-large.mp4"),
            Video("https://assets.mixkit.co/videos/preview/mixkit-tree-with-yellow-flowers-1173-large.mp4"),
            Video("https://assets.mixkit.co/videos/preview/mixkit-mother-with-her-little-daughter-eating-a-marshmallow-in-nature-39764-large.mp4"),
            Video("https://assets.mixkit.co/videos/preview/mixkit-family-walking-together-in-nature-39767-large.mp4"),
            Video("https://assets.mixkit.co/videos/preview/mixkit-the-spheres-of-a-christmas-tree-2720-large.mp4"),
            Video("https://assets.mixkit.co/videos/preview/mixkit-red-frog-on-a-log-1487-large.mp4")
        )
    }
}