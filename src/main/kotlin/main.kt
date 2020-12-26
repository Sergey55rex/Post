fun main() {
    val post = Post(

        1,
        "18.12.2020",
        "text",
        0,
        original = null,
            comments = Comments(
                    1,
                    true,
                    false,
                    false,
                    true
            ),
            likes = null,
            reposts = null,
            views = null,
            attachment = Audio(33333, "Поворот", 222, 4)
             //attachment = null
    )

    println( post.original?.text?:"нет текста в original")
    println( if ((post.comments?.canPost?: Boolean) as Boolean)"пользователь может комментировать запись" else "пользователь не может комментировать запись" )
    println( post.attachment?.type?: "нет значения поля Type")

    println(WallService.add(post))
    val resultUpdate = WallService.update(post)
    println(resultUpdate)

    choice(post.attachment)
}

fun choice(attachment: Attachment?): Boolean{
    when (attachment) {
        is Video -> println("Видео играет ${attachment.duration}")
        is Photo -> println("Фото из ${attachment.text}")
        is Audio -> println("Длительность трека ${attachment.duration} минут")
        is Doc -> println("Документ с текстом: ${attachment.text}")
        is Sticker -> println("Документ с текстом: ${attachment.text}")
        else -> print("Неизвестный тип вложения")
    }
    if (attachment == null) {
        return true
    }else{
        return  false
    }
}





