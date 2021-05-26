package hackerRank.interviewPreparationKit.warmUpChallenges

fun main(){
    println(repeatedString("aba",10))
}

fun repeatedString(s: String, n: Long): Long {
    var repeatedString: String = ""
    var i = 0
    var j = 0
    while(n>j) {
        repeatedString += s[i]
        if (i == s.lastIndex) {
            i = 0
            j++
        } else {
            i++
            j++
        }
    }
    repeatedString = repeatedString.filter { index -> index == 'a' }
    var countA = repeatedString.length
    return countA.toLong()
}