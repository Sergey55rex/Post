data class Doc(
        val id : Int,
        val text: String,
        val ownerId: Int,
        override val type: String = "doc"
) : Attachment