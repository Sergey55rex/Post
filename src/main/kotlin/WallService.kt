object WallService {
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val id = if (posts.isEmpty()) 1 else posts.last().id + 1;
        val copy = post.copy(id = id)
        posts += copy
        return posts.last()
    }

    fun update(post: Post): Boolean {
        posts.forEachIndexed { index, post ->
            if (post.id == posts.last().id) {
                val target = posts[index]
                val copy = target.copy(id = target.id, date = target.date)
                posts[index] = copy
                return true
            }
        }
        return false
    }
}

