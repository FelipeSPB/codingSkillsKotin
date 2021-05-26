package hackerRank.algorithms.warmup


fun main(){
    println(aVeryBigSum(arrayOf(1000000001,1000000002,1000000003,1000000004,1000000005)));
}

fun aVeryBigSum(array: Array<Long>): Long{
    var sum: Long = 0
    for(i in array){
        sum+=i;
    }
    return sum;
}