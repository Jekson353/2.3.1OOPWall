package ru.wall

data class Post(
        val id: Int? = null,
        val ownerId: Int,
        val fromId: Int,
        val createdBy: Int,
        val date: Long,
        val text: String = "",
        val replyOwnerId: Int? = null,
        val replyPostId: Int = 0,
        val friendsOnly: Boolean = false,
        val comments: String = "",
        val copyright: String = "",
        val likes: Int = 0,
        val reposts: Post? = null,
        val views: Int = 0,
        val postType: String = "",
        val postSource: Post? = null,
        val geo: String? = null,
        val signerId: Int = 0,
        val canPin: Boolean = false,
        val canDelete: Boolean = false,
        val isPinned: Boolean = false,
        val markedAsAds: Boolean = false,
        val isFavorite: Boolean = false,
        val postenedId: Int = 0
)