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
            0
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
            0))

        val update = Post(
            1,
            "18.12.2020",
            "text",
            0)

        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun updateExistingFalse() {
        service.add(Post(
            3,
            "18.12.2020",
            "text text",
            0))

        val update = Post(
            3,
            "18.12.2020",
            "text",
            0)
        val result = service.update(update)
        assertFalse(result)
    }
}

