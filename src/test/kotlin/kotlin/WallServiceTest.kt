import data.*
import junit.framework.Assert.assertEquals
import org.junit.Test

class WallServiceTest {
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
    val firstVideo = AttachmentVideo (player = null)
    val firstPhoto = AttachmentPhoto (sizes = null)
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

    @Test
    fun add() {
        var test: Boolean = true
        WallService.add(firstPost)
        if (firstPost.id == 0) test = false
        assertEquals(true, test)
    }

    @Test
    fun updateRealID() {
        WallService.add(firstPost)
        assertEquals(true, WallService.update(firstPost))
    }

    @Test
    fun updateNotRealID() {
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

        val secondPost = Post(
            id = 5,
            comments = firstComments,
            likes = firstLikes,
            reposts = firstReposts,
            views = firstViews,
            postType = PostType.POST,
            attachment = firstAttachment
        )
        assertEquals(false, WallService.update(secondPost))
    }
}