fun main() {
    val morningNotification = 50
    val eveningNotification = 101
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}
fun printNotificationSummary(numberOfMessages: Int) {

    if (numberOfMessages < 100) {
        println("tu tienes $numberOfMessages")
    } else if (numberOfMessages > 100) {
        println("tienes mas de 99+ notificaciones")
    } else {
        println("no tienes notificaciones")
    }
}
      