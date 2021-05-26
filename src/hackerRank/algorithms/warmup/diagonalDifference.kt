package hackerRank.algorithms.warmup

import kotlin.math.absoluteValue

fun main(){
    println(diagonalDifference(arrayOf(arrayOf(11,2,4),arrayOf(4,5,6),arrayOf(10,8,-12))))
}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var sumDiagonalA: Int = 0;
    var sumDiagonalB: Int = 0;
    var len: Int = (arr.size-1)
    for(j in 0..len){
        var indiceReverse: Int = (arr[j].size-1) - j;
        sumDiagonalA+=arr[j][j]
        sumDiagonalB+=arr[j][indiceReverse]
    }
    return (sumDiagonalA - sumDiagonalB).absoluteValue;
}
