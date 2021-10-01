package data

data class Comments(
    var count: Int = 0,
    var canPost: Boolean = false,
    var groupsCanPost: Boolean = false,
    var canClose: Boolean = false,
    var canOpen: Boolean = false
)