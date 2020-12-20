data class Post (
    var id: Long,
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
    val comments: Any = 0,
    val copyright: Any = 0,
    val likes: Any = 0,
    val reposts: Any = 0,
    val views: Any = 0,
    val donut: Any = 0,


    ) {


        // var lices: Int = lices
        //set(value){
        //    if (value >= 0) {
        //       field = value
        //   }
         //}

    }