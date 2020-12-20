import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    val service = WallService

    @Test
    fun addPost() {
        val expected = Post(
            0,
            "18.12.2020",
            "text",
            0
        )

        val result = service.add(expected)
        assertEquals(expected, result)
    }

    @Test
    fun updateExisting() {
        service.add(Post(
            0,
            "18.12.2020",
            "text",
            0))

        service.add(Post(
            1,
            "19.12.2020",
            "text",
            0))

        service.add(Post(
            0,
            "18.12.2020",
            "text text",
            0))

        val update = Post(
            0,
            "18.12.2020",
            "text",
            0)

        val result = service.update(update)
        assertFalse(result)
    }
}
