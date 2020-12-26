data class Audio(
        val id : Int,
        val text: String,
        val ownerId: Int,
        val duration: Int,
        override val type: String = "audio"
) : Attachment