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

    val firstPost = Post(
        id = 1,
        comments = firstComments,
        likes = firstLikes,
        reposts = firstReposts,
        views = firstViews,
        postType = PostType.POST
    )

    println(firstPost)
    WallService.add(firstPost)
    println(WallService.update(firstPost))
    println(firstPost)
}