class Sticker(
        val id : Int,
        val text: String,
        val ownerId: Int,
        override val type: String = "sticker"
) : Attachment