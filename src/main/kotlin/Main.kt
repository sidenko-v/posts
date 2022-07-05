fun main() {

    val wallService = WallService()

    val post = Post(
        1,
        1,
        1,
        1,
        1,
        "123",
        11,
        1,
        true,
        Object(),
        "123",
        Object(),
        Object(),
        Object(),
        "123",
        1,
        true,
        true,
        false,
        true,
        false,
        false,
        1
    )

    wallService.add(post)
    val postWIthId = wallService.posts.last()
    postWIthId.canDelete=false
    wallService.update(postWIthId)
    println(wallService.posts.last())
}