package hackerRank.algorithms.warmup

import java.text.SimpleDateFormat




fun main(){
    println(timeConversion("07:05:45PM"))
}

fun timeConversion(s: String): String {
    var date12Format = SimpleDateFormat("hh:mm:ssaa")
    var date24Format = SimpleDateFormat("HH:mm:ss")
    return date24Format.format(date12Format.parse(s))

}