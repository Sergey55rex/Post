fun main() {

    val post = Post(
        1,
        "18.12.2020",
        "text",
        0,

    )
    println(WallService.add(post))
    val resultUpdate = WallService.update(post)
    println(resultUpdate)
}


