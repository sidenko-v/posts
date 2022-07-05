import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_test() {
        val wallService = WallService()
        val post = Post(
            1,
            1,
            1,
            1,
            1,
            "123",
            11,
            1,
            true,
            Object(),
            "123",
            Object(),
            Object(),
            Object(),
            "123",
            1,
            true,
            true,
            false,
            true,
            false,
            false,
            1
        )
        wallService.add(post)
        val postWIthId = wallService.posts.last()
        assertTrue(postWIthId.id > 0)
    }

    @Test
    fun update_true() {

        val wallService = WallService()
        val post = Post(
            1,
            1,
            1,
            1,
            1,
            "123",
            11,
            1,
            true,
            Object(),
            "123",
            Object(),
            Object(),
            Object(),
            "123",
            1,
            true,
            true,
            false,
            true,
            false,
            false,
            1
        )

        wallService.add(post)
        val postWIthId = wallService.posts.last()
        postWIthId.canDelete = false
        assertTrue(wallService.update(postWIthId))
    }

    @Test
    fun update_false() {

        val wallService = WallService()
        val post = Post(
            1,
            1,
            1,
            1,
            1,
            "123",
            11,
            1,
            true,
            Object(),
            "123",
            Object(),
            Object(),
            Object(),
            "123",
            1,
            true,
            true,
            false,
            true,
            false,
            false,
            1
        )

        val post2 = Post(
            1,
            1,
            1,
            1,
            1,
            "123",
            11,
            1,
            true,
            Object(),
            "123",
            Object(),
            Object(),
            Object(),
            "123",
            1,
            true,
            true,
            false,
            true,
            false,
            false,
            1
        )

        wallService.add(post)
        assertFalse(wallService.update(post2))
    }
}