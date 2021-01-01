import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
   val service = WallService

    @Test
    fun addPost() {
        val expected = Post(
            2,
            "18.12.2020",
            "text",
            0,
                    original = null,
                comments = Comments(
                        1,
                        true,
                        false,
                        false,
                        true
                ),
                likes = null,
                reposts = null,
                views = null,
                attachment = null,
                attechments = null
        )
        val result = service.add(expected)
        assertEquals(expected, result)
    }

    @Test
    fun updateExistingTrue() {
        service.add(Post(
            1,
            "18.12.2020",
            "text",
            0,
                original = null,
                comments = Comments(
                        1,
                        true,
                        false,
                        false,
                        true
                ),
                likes = null,
                reposts = null,
                views = null,
                attachment = null,
                attechments = null
        ),

        )

        val update = Post(
            1,
            "18.12.2020",
            "text",
            0,
                    original = null,
                comments = Comments(
                        1,
                        true,
                        false,
                        false,
                        true
                ),
                likes = null,
                reposts = null,
                views = null,
                attachment = null,
                attechments = null
        )

        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun updateExistingFalse() {
        service.add(Post(
            3,
            "18.12.2020",
            "text text",
            0,
                original = null,
                comments = Comments(
                        1,
                        true,
                        false,
                        false,
                        true
                ),
                likes = null,
                reposts = null,
                views = null,
                attachment = null,
                attechments = null
        ))

        val update = Post(
            3,
            "18.12.2020",
            "text",
            0,
                original = null,
                comments = Comments(
                        1,
                        true,
                        false,
                        false,
                        true
                ),
                likes = null,
                reposts = null,
                views = null,
                attachment = null,
                attechments = null
        )
        val result = service.update(update)
        assertFalse(result)
    }

    //@Test
    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val error = "PostNotFoundException"

        val result =     service.createComment(
                coment = Coment(
                    1,
                    1,
                    3,
                    "ttttttyyyy",
                    4,
                    attachments = Attechments(),
                    5,
                    "nnnnnnnnnnn"
            )
        )


println(result)
           //assertFalse(result )


//        val result = service.createComment(
//                coment = Coment(
//                    1,
//                    1,
//                    3,
//                    "ttttttyyyy",
//                    4,
//                    attachments = Attechments(),
//                    5,
//                    "nnnnnnnnnnn"
//            )
//        )
//
//        assertTrue(result)


        // здесь код с вызовом функции, которая должна выкинуть PostNotFoundException
    }

//    fun shouldThrow() {
//
//        val expected = PostNotFoundException::class
//
//        val result = service.createComment(
//                coment = Coment(
//                    1,
//                    1,
//                    3,
//                    "ttttttyyyy",
//                    4,
//                    attachments = Attechments(),
//                    5,
//                    "nnnnnnnnnnn"
//            )
//        )
//        try {
//
//        }catch (e: PostNotFoundException){
//            println("пост с таким id не существует")
//        }
//
//        //assertEquals(expected, result)
//        println(expected)
//        println(result)




}

