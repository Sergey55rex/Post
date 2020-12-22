object WallService {
     var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val id = if (posts.isEmpty()) 1 else posts.last().id + 1;
        val copy = post.copy(id = id)
        posts += copy
        return posts.last()
    }

    fun update(post: Post ): Boolean {
        val id = post.id
         for ((infix , post) in posts.withIndex()) {
             if (post.id == id){
                return true
            }
        }
        return false
    }
}

