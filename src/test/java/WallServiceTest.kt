import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.w3c.dom.Comment

class WallServiceTest {
   val service = WallService

    @Test
    fun addPost() {
        val expected = Post(
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
        val result = service.add(expected)
        assertEquals(expected, result)
    }

    @Test
    fun updateExistingTrue() {
        service.add(Post(
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


    @Test
    fun shouldThrowTrue() {
        service.add(Post(
                4,
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

       val coment =   (Coment(
                1,
                1,
                3,
                "hhhhhhhhhh",
                5,
                attachments = Attechments(),
                5,
                "fffffffffffffff"
        ))
        val result = service.createComment(coment)
        assertTrue(result)

    }

    @Test
    fun shouldThrowFalse() {
        service.add(Post(
                5,
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
        val coment =   (Coment(
                1,
                5,
                3,
                "hhhhhhhhhh",
                5,
                attachments = Attechments(),
                5,
                "fffffffffffffff"
        ))
        val result = service.createComment(coment)
        assertFalse(result)

    }



}

