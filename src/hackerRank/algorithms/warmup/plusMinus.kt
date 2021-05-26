package hackerRank.algorithms.warmup

fun main(){
    plusMinus(arrayOf(1,1,0,-1,-1))
}

fun plusMinus(arr: Array<Int>): Unit {
    var countPlus: Double = 0.0
    var countMinus: Double = 0.0
    var countZero: Double = 0.0
    var size: Double = arr.size.toDouble()
    for(i in 0..(arr.size-1)){
        if(arr[i]>0){
            countPlus+=1.0
        }else if(0>arr[i]){
            countMinus+=1.0
        }else{
            countZero+=1.0
        }
    }
    println((countPlus/arr.size))
    println((countMinus/arr.size))
    println((countZero/arr.size))

}