package hackerRank.interviewPreparationKit.warmUpChallenges

import hackerRank.algorithms.warmup.gradingStudents

fun main(){
    println(sockMerchant(6,arrayOf(1,1,1,1,1,3,4,5)))
}

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var countPairs: Int = 0
    var socksNoted: Array<Int> = emptyArray()
    for(i in 0..(n-1)){
        var checkingSimilarsSocks = ar.filter{index -> index == ar[i]}
        if(socksNoted.filter{index -> index == ar[i]}.size == 0){
            socksNoted+=ar[i]
            countPairs += (checkingSimilarsSocks.size/2)
        }
    }
    return countPairs
}