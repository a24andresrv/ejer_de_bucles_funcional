import kotlin.math.abs
import kotlin.math.min

fun main() {
    generateSequence(::readLine)
        .takeWhile { it != "0 0" }
        .forEach { line ->
            val (a, b) = line.split(" ").map { it.toInt() }
            val diff = abs(a - b)
            println(min(diff, 99 - diff))
        }
}
