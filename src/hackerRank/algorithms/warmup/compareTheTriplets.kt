package hackerRank.algorithms.warmup

fun main(){
    println(compareTheTriplets(arrayOf(5,6,7), arrayOf(3,6,10)).joinToString("  "))
}

fun compareTheTriplets(a: Array<Int>, b: Array<Int>): Array<Int>{
    var countA: Int = 0;
    var countB: Int = 0;
    var i: Int = 0;
    while(a.size>i){
        if (a[i]>b[i]){
            countA++
        } else if(b[i]>a[i]){
            countB++
        }
        i++
    }
    var resultsArray: Array<Int> = arrayOf(countA,countB);
    return resultsArray;
}