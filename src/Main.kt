import kotlin.math.abs
import kotlin.math.min

fun main() {
    var canales = readln().split(" ")
    while (canales != listOf(0, 0)) {
        var resultado=min(
            abs(canales.first().toInt()-canales.last().toInt()),
            (99-abs(canales.first().toInt()-canales.last().toInt()))
        )
        println(resultado)
        canales = readln().split(" ")
    }
}