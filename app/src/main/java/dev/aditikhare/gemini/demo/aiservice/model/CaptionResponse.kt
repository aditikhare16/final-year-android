package dev.aditikhare.gemini.demo.aiservice.model

import kotlinx.serialization.Serializable

@Serializable
data class CaptionResponse(val caption: String, val hashtags: List<String>)
