import org.junit.Assert

object WallService {
    var posts = emptyArray<Post>()
    var coments = emptyArray<Coment>()


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
                  println(post.id)
                 return true
            }
        }
        return false
    }

//    fun createComment(coment: Coment) :Coment {
//
//        for ((index, post) in posts.withIndex()) {
//
//            if (coment.postId == post.id){
//               println(" id совпали ")
//                val copy = coment.copy()
//                coments += copy
//            } else {
//                try {
//                    throw PostNotFoundException ("id не существует")
//
//    }catch (e: PostNotFoundException){
//        println("пост с таким id не существует")
//    }
//       }
//            }
//        return  coment
//    }




    fun createComment(coment: Coment) :Boolean {

        for ((index, post) in posts.withIndex()) {

            if (coment.postId == post.id){
                println(" id совпали ")
                val copy = coment.copy()
                coments += copy
                return true
            }
        }

                    try {
                        throw PostNotFoundException ("id не существует")
                }catch (e: PostNotFoundException){

                    println("пост с таким id не существует")
                        return  false
                }

    }


}

