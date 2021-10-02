import data.*

fun main() {
    var attachments = emptyArray<Attachment>()
    val audio = Audio(
        1, 1, "One", "Audio", "FirstAudio"
    )
    val audioAttachment = AudioAttachment(audio = audio)
    attachments += audioAttachment

    val firstComments = Comments(
        canPost = true
    )
    val firstLikes = Likes(
        canLike = true
    )
    val firstReposts = Reposts()
    val firstViews = Views(
        count = 1
    )

    val firstPost = Post(
        id = 1,
        ownerId = 1,
        fromId = 1,
        createdBy = 1,
        date = 1234,
        text = "Hello",
        replyOwnerId = 2,
        replyPostId = 2,
        friendsOnly = false,
        comments = firstComments,
        copyright = "5",
        likes = firstLikes,
        reposts = firstReposts,
        views = firstViews,
        postType = PostType.POST,
        postSource = null,
        attachment = attachments,
        geo = null,
        copyHistory = null,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = true,
        isFavorite = true,
        postponedId = 4
    )

    println(firstPost)
    WallService.add(firstPost)
    println(WallService.update(firstPost))
    println(firstPost)
}