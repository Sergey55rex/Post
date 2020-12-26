
//class Attachment {
//        var attachment = emptyArray<Type,Types>()
//    fun add(type: Type, types: Types): Types {
//         attachment += (type, types)
//        val type = if (attachment.isEmpty())types.type else null;
//        val copy = attachment.copy(type = type)
//        attachment += copy
//        return attachment.last()
//    }
//
//}

interface Attachment {
    val type: String?
    //val type = if (attachment != null) String?  ;
}


