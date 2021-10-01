package data

data class Post(
    var id: Int,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int? = null,
    val date: Int = 0,
    var text: String = " ",
    val replyOwnerId: Int? = null,
    val replyPostId: Int? = null,
    var friendsOnly: Boolean = false,
    val comments: Comments,
    val copyright: String = " ",
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    var postType: PostType,
    val postSource: PostSource? = null,
    var attachment: Array<Attachment>? = null,
    val geo: Geo? = null,
    val signerId: Int = 0,
    val copyHistory: ArrayList<Post>? = null,
    var canPin: Boolean = false,
    var canDelete: Boolean = false,
    var canEdit: Boolean = false,
    var isPinned: Boolean = false,
    var markedAsAds: Boolean = false,
    var isFavorite: Boolean = false,
    var postponedId: Int = 0
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Post) return false

        if (id != other.id) return false
        if (ownerId != other.ownerId) return false
        if (fromId != other.fromId) return false
        if (createdBy != other.createdBy) return false
        if (date != other.date) return false
        if (text != other.text) return false
        if (replyOwnerId != other.replyOwnerId) return false
        if (replyPostId != other.replyPostId) return false
        if (friendsOnly != other.friendsOnly) return false
        if (comments != other.comments) return false
        if (copyright != other.copyright) return false
        if (likes != other.likes) return false
        if (reposts != other.reposts) return false
        if (views != other.views) return false
        if (postType != other.postType) return false
        if (postSource != other.postSource) return false
        if (attachment != null) {
            if (other.attachment == null) return false
            if (!attachment.contentEquals(other.attachment)) return false
        } else if (other.attachment != null) return false
        if (geo != other.geo) return false
        if (signerId != other.signerId) return false
        if (copyHistory != other.copyHistory) return false
        if (canPin != other.canPin) return false
        if (canDelete != other.canDelete) return false
        if (canEdit != other.canEdit) return false
        if (isPinned != other.isPinned) return false
        if (markedAsAds != other.markedAsAds) return false
        if (isFavorite != other.isFavorite) return false
        if (postponedId != other.postponedId) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + ownerId
        result = 31 * result + fromId
        result = 31 * result + (createdBy ?: 0)
        result = 31 * result + date
        result = 31 * result + text.hashCode()
        result = 31 * result + (replyOwnerId ?: 0)
        result = 31 * result + (replyPostId ?: 0)
        result = 31 * result + friendsOnly.hashCode()
        result = 31 * result + comments.hashCode()
        result = 31 * result + copyright.hashCode()
        result = 31 * result + likes.hashCode()
        result = 31 * result + reposts.hashCode()
        result = 31 * result + views.hashCode()
        result = 31 * result + postType.hashCode()
        result = 31 * result + (postSource?.hashCode() ?: 0)
        result = 31 * result + (attachment?.contentHashCode() ?: 0)
        result = 31 * result + (geo?.hashCode() ?: 0)
        result = 31 * result + signerId
        result = 31 * result + (copyHistory?.hashCode() ?: 0)
        result = 31 * result + canPin.hashCode()
        result = 31 * result + canDelete.hashCode()
        result = 31 * result + canEdit.hashCode()
        result = 31 * result + isPinned.hashCode()
        result = 31 * result + markedAsAds.hashCode()
        result = 31 * result + isFavorite.hashCode()
        result = 31 * result + postponedId
        return result
    }
}