package data

class AttachmentVideo(
    override val id: Int = 11,
    override val albumID: Int = 11,
    override val ownerID: Int = 11,
    override val userID: Int = 11,
    override val type: AttachmentType = AttachmentType.VIDEO,
    val title: String = "Video11",
    val description: String = "Super Video",
    val duration: Int = 600,
    val player: String?,
    val date: Int = 0
) : Attachment {

}