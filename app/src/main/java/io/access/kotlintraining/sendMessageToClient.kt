package io.access.kotlintraining

// コンパイル通すための諸々
class Client (val personalInfo: PersonalInfo?)

class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String): String
}

class SuperMailer : Mailer {
    override fun sendMessage(email: String, message: String): String {
        //println("Hello, $email, $message!")
        return "Hello, $email, $message!"
    }
}

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer): String? {
    /*
    @Nullable Client client,
    @Nullable String message,
    @NonNull Mailer mailer,    */
    if (message == null) return ""

    val personalInfo = client?.personalInfo
    personalInfo ?: return ""

    val email = personalInfo?.email?.let {
        mailer.sendMessage(it, message) }
    return email
}
