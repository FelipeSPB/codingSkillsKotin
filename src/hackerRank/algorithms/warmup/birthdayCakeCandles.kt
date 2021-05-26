package hackerRank.algorithms.warmup

fun main(){
    println(birthdayCakeCandles(arrayOf(3,2,1,3,4)))
}

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var countCandles = 0
    for(i in candles){
        if(i==candles.max()){
            countCandles++
        }
    }
    return countCandles
}

fun birthdayCakeCandlesAlternative(candles : Array<Int>): Int{
    return candles.filter{ i -> i==candles.max()}.count()
}

fun birthdayCakeCandlesThatPassedAllTheTests(candles: Array<Int>):Int{
    var tallestCandles: Int = candles.max()!!
    var newlist = candles.filter{index -> index == tallestCandles}
    return newlist.size
}