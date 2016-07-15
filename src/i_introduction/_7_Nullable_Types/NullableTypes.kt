package i_introduction._7_Nullable_Types

fun test() {
    val s: String = "this variable cannot store null references"
    val q: String? = null

    if (q != null) q.length      // you have to check to dereference
    val i: Int? = q?.length      // null
    val j: Int = q?.length ?: 0  // 0
}

// 如果变量允许为空，则需要在类型后添加？，否则默认不为空
fun sendMessageToClient(
        client: Client?,
        message: String?,
        mailer: Mailer
) {
    if (client == null || message == null) return

    val personalInfo = client.personalInfo ?: return

    val email = personalInfo.email ?: return

    mailer.sendMessage(email, message)
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}
