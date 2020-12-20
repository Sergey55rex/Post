object WallService {
    var id = 0L
    var privateID = 0L
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val copy = post.copy(id = id++)
        posts += copy
        return posts.last()
    }

    fun update(post: Post): Boolean {
        posts.forEachIndexed { index, post ->
            if (post.id == id) {
                val target = posts[index]
                val copy = target.copy(id = target.id, date = target.date)
                posts[index] = copy
                return true
            }
        }
        return false
    }
}
