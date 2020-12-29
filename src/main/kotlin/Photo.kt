data class Photo(
        val id : Int,
        val text: String,
        val ownerId: Int,
        override val type: String = "photo"
) : Attachment