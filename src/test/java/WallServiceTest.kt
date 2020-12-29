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
}

