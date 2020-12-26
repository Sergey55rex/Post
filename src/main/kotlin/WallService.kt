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
         for ((index , post) in posts.withIndex()) {
             if (post.id == id){
                 posts[index] = post.copy(text = "test", lices = post.lices + 1, postType = "visio")
                 //println(posts[index])
                 return true
            }
        }
        return false
    }
}

