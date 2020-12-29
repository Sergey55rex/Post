
data class Post (
        var id: Long = 0,
        val date: String,
        val text: String,
        val lices: Int,
        val ownerId: Int = 0,
        val fromId: Int = 0,
        val createdBy: Int = 0,
        val replyOwnerId: Int = 0,
        val replyPostId: Int = 0,
        val friendsOnly: Boolean = false,
        val postType: String = "",
        val signerId: Int = 0,
        val canPin: Boolean = false,
        val canDelete: Boolean = false,
        val canEdit: Boolean = false,
        val isPinned: Boolean = false,
        val markedAsAds: Boolean = false,
        val isFavorite: Boolean = false,
        val postponedId: Int = 0,
        val comments: Comments?,
        val copyright: String = "",
        val likes: Likes?,
        val reposts: Reposts?,
        val views: Views?,
        val original: Post?,
        val attachment: Attachment?,
        val attechments: Array<Attechments>?

    ){
    fun isRepost(): Boolean{
        if (original != null){
            println(true)
            return true
        }
        println(false)
        return false
    }

    fun repost(post: Post): Post{
        val original =  post.original?: post
        TODO()
    }


}

