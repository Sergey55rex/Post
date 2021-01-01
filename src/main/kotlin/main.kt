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
            attachment = AudioAttachment("audio", Audio(88,"hhhhhhh",2,22)),
            //attachment = VideoAttachment("video", Video(5))
            //attachment = null
            attechments = null

    )

    val coment = Coment(
            1,
            1,
            3,
            "комментарии к посту",
            3,
            null,
            4,
            "hhh"
    )

    println( post.original?.text?:"нет текста в original")
    println( if ((post.comments?.canPost?: Boolean) as Boolean)"пользователь может комментировать запись" else "пользователь не может комментировать запись" )
   // println( post.attachment?.type?: "нет значения поля Type")
    WallService.add(post)
   //println(WallService.add(post))
    val resultUpdate = WallService.update(post)
    println(resultUpdate)

    WallService.createComment(coment)

    choice(post.attachment)
}

fun choice(attachment: Attachment?): Boolean{
    when (attachment) {
        is VideoAttachment-> println("Видео идет ${attachment.video.duration} минут")
        is PhotoAttachment -> println("Фото из ${attachment.photo.text}")
        is AudioAttachment -> println("Длительность трека ${attachment.audio.duration} минут")
        is DocAttachment -> println("Документ с текстом: ${attachment.doc.ownerId}")
        is StickerAttachment -> println("Документ с текстом: ${attachment.sticker.ownerId}")
        else -> print("Неизвестный тип вложения")
    }
    if (attachment == null) {
        return true
    }else{
        return  false
    }
}



