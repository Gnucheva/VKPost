package data

data class Post(
    var id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Long,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val copyright: Copyright?,
    val reposts: Reposts?,
    val views: Views?,
    val postType: String,
    val attachments: Attachments?,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Long,
)

class Comment(
    val ownerId: Int,
    val postId: Int,
    val fromGroup: Int = 0,
    val message: String,
    val replyToComment: Int,
    val stickerId: Int,
    val guid: String
)

class PostNotFoundException(message: String) : RuntimeException(message)

class Copyright {
    val id = 0
    val link = ""
    val name = ""
    val type = ""
}

class Reposts {
    val count = 0
    val userReposted = false
}

class Views {
    val count = 0
}

enum class PostType {
    POST,
    COPY,
    REPLY,
    POSTPONE,
    SUGGEST
}


