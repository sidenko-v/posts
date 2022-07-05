import java.time.LocalDateTime

class WallService() {

    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        post.id =
            ("${LocalDateTime.now().year}" +
                    "${LocalDateTime.now().dayOfYear}" +
                    "${LocalDateTime.now().nano}").toLong()
        posts += post
        return post
    }

    fun update(post: Post): Boolean {
        var result = false
        for (i in 0..posts.lastIndex) {
            if (posts[i].id == post.id) {
                posts[i].fromId = post.fromId
                posts[i].createdBy = post.createdBy
                posts[i].text = post.text
                posts[i].replyOwnerId = post.replyOwnerId
                posts[i].replyPostId = post.replyPostId
                posts[i].friendsOnly = post.friendsOnly
                posts[i].comments = post.comments
                posts[i].copyright = post.copyright
                posts[i].likes = post.likes
                posts[i].reposts = post.reposts
                posts[i].views = post.views
                posts[i].postType = post.postType
                posts[i].signerId = post.signerId
                posts[i].canPin = post.canPin
                posts[i].canDelete = post.canDelete
                posts[i].canEdit = post.canEdit
                posts[i].isPinned = post.isPinned
                posts[i].markedAsAds = post.markedAsAds
                posts[i].isFavorite = post.isFavorite
                posts[i].postponedId = post.postponedId
                result = true
                break
            }
        }
        return result
    }
}