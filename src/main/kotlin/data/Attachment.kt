package data

interface Attachment {
    val id: Int
    val albumID: Int
    val ownerID: Int
    val userID: Int
    val type: AttachmentType
}

enum class AttachmentType {
    VIDEO, AUDIO, PHOTO, DOC, LINK
}