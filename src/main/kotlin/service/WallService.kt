import data.Post

object WallService {
    private var posts = emptyArray<Post>()
    private var nextId: Int = 0

    fun add(post: Post): Post {
        posts += post
        post.id = nextId
        nextId++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (updatePost in posts) {
            if (updatePost.id == post.id) {
                updatePost.text = "some text"
                println("data.Post update")
                return true
            }
            break
        }
        println("Failed to update post")
        return false
    }
}
