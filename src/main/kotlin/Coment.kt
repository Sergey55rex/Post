data class Coment(

        val ownerId: Long =0,
        val postId: Long = 0,
        val fromGroup: Int = 0,
        val message: String,
        val replyToComment: Int,
        val attachments: Attechments?,
        val stickerId: Int,
        val guid: String

)