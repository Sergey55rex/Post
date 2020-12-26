data class Video(
        val duration: Long,
        override val type: String = "video"
) : Attachment