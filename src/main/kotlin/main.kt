import data.*

fun main() {
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
    val firstVideo = AttachmentVideo(player = null)
    val firstPhoto = AttachmentPhoto(sizes = null)
    val firstAttachment = arrayOf(firstPhoto, firstVideo)

    val firstPost = Post(
        id = 1,
        comments = firstComments,
        likes = firstLikes,
        reposts = firstReposts,
        views = firstViews,
        postType = PostType.POST,
        attachment = firstAttachment
    )

    println(firstPost)
    WallService.add(firstPost)
    println(WallService.update(firstPost))
    println(firstPost)
}