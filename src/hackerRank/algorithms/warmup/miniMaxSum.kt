package hackerRank.algorithms.warmup

fun main(){
    miniMaxSum(arrayOf(140638725,436257910,953274816,734065819,362748590))
}

fun miniMaxSum(arr: Array<Long>): Unit {
     println((arr.sum()-arr.max()!!).toString()+" "+(arr.sum()- arr.min()!!).toString())
}