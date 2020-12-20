fun main() {

    val post = Post(
        0,
        "18.12.2020",
        "text",
        0
    )

    val post1 = Post(
        0,
        "19.12.2020",
        "text",
        0
    )

    println(WallService.add(post))
    println(WallService.add(post1))

    val resultUpdate = WallService.update(post)
    println(resultUpdate)
}
