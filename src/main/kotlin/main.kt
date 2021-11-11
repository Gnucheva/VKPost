import data.*

val service = WallService()

fun main() {

    val copyright = Copyright()
    val reposts = Reposts()
    val views = Views()
    val vId = 0
    val post = Post(
        id = vId,
        ownerId = 1,
        fromId = 1,
        createdBy = 1,
        date = 1234,
        text = "Text",
        replyOwnerId = 4,
        replyPostId = 5,
        friendsOnly = false,
        copyright = copyright,
        reposts = reposts,
        views = null,
        postType = "post",
        attachments = null,
        signerId = 1,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 0
    )
    println("Post created")
    println(service.add(post))

    val post2 = Post(
        id = vId,
        ownerId = 1,
        fromId = 1,
        createdBy = 5,
        date = 1234,
        text = "Text2",
        replyOwnerId = 6,
        replyPostId = 6,
        friendsOnly = false,
        copyright = copyright,
        reposts = reposts,
        views = views,
        postType = "copy",
        attachments = null,
        signerId = 1,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 0
    )
    println("Post update $vId")
    println(updPost(post2))

    val vIdNew = 100
    val post3 = Post(
        id = vIdNew,
        ownerId = 10,
        fromId = 11,
        createdBy = 51,
        date = 12123,
        text = "New text",
        replyOwnerId = 46,
        replyPostId = 456,
        friendsOnly = false,
        copyright = copyright,
        reposts = reposts,
        views = views,
        postType = "post",
        attachments = null,
        signerId = 1,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 0
    )
    println("Post update $vIdNew")
    println(updPost(post3))

    val comment =
        Comment(ownerId = 1, postId = 0, message = "Comment to the post", replyToComment = 0, stickerId = 0, guid = "")
    service.createComment(comment)
}

fun updPost(post: Post): String {
    val vId = post.id
    return if (service.update(post)) "Post $vId successfully changed"
    else "Could not change the post $vId"
}
