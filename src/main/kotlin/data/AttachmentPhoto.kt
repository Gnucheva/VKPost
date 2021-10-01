package data

class AttachmentPhoto(
    override val id: Int = 100,
    override val albumID: Int = 100,
    override val ownerID: Int = 100,
    override val userID: Int = 100,
    override val type: AttachmentType = AttachmentType.PHOTO,
    val text: String = "Photo100",
    val date: Int = 0,
    val sizes: Array<AttachmentPhotoProperties>?

) : Attachment {
}

class AttachmentPhotoProperties(
    val type: String,
    val url: Int,
    val width: Int,
    val height: Int
) {

}