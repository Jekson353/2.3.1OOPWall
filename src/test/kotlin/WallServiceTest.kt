package ru.wall

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService
        val post = Post(
            ownerId = 15,
            fromId = 25,
            createdBy = 1,
            date = 0,
            text = "Новый пост 22",
            replyPostId = 10,
            comments = "",
            copyright = "",
            likes = 0,
            views = 0,
            postType = "",
            signerId = 0,
        )
        val result = service.add(post)
        val addpost = post.copy(id = 1)
        assertEquals(result, addpost)
    }


    @Test
    fun update() {
        val service = WallService
        val post = Post(
            id = 0,
            ownerId = 15,
            fromId = 25,
            createdBy = 1,
            date = 0,
            text = "Новый пост 1",
            replyPostId = 10,
            comments = "",
            copyright = "",
            likes = 0,
            views = 0,
            postType = "",
            signerId = 0,
        )
        service.add(Post(ownerId = 10, createdBy = 0, date = 0, fromId = 10))
        val result = service.update(post)
        assertTrue(result)
    }

    @Test(expected = Exception::class)
    fun getPost() {
        val service = WallService
        service.getPost(id = 10)
    }
}