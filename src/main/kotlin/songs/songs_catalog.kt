package songs

class Song(
    var title: String,
    var artist: String,
    var yearPublished: Int,
    var playCount: Int
) {
    val popular: Boolean
        get() = playCount > 1_000

    fun printSong() {
        println("$title, performed by $artist, was released in $yearPublished, is it popular? $popular")
    }
}

fun main() {
    val song = Song(
        "Good Luck Babe",
        "Chapel Roan",
        yearPublished = 2024,
        playCount = 108_000_000)
    song.printSong()

}