package com.example.tikoteko.domain

interface VideosRepository {
    fun getVideos(): List<Video>
}