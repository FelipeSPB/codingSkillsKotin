package hackerRank.algorithms.warmup

fun main(){
    staircase(5)
}

fun staircase(n: Int): Unit {
    for(i in 1..n){
        println(" ".repeat(n-i)+"#".repeat(i))
    }
}