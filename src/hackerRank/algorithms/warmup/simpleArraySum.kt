package hackerRank.algorithms.warmup

fun main(){
    println(simpleArraySum(arrayOf(1,2,3)));
}

fun simpleArraySum(array: Array<Int>): Int{
    var sum: Int = 0
    for(i in array){
        sum+=i;
    }
    return sum;
}