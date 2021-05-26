package hackerRank.algorithms.Implementation


fun main(){
    for(i in breakingRecords(arrayOf(100000000,100000000,10000000,10000000,1000000))){
        println(i)
    }
}

fun breakingRecords(scores: Array<Long>): LongArray {
    var min: Long = 0
    var max: Long = 0
    var countBreakingRecordsMax: Long = 0
    var countBreakingRecordsMin: Long = 0

    if(scores.size==0){
        return longArrayOf(0,0)
    }

    if(scores[0] > scores[1]){
        min = scores[1]
        max = scores[0]
        countBreakingRecordsMin++
    } else if(scores[1] > scores[0]){
        max = scores[1]
        min = scores[0]
        countBreakingRecordsMax++
    }else{
        max = scores[0]
        min = scores[0]
    }


    for (i in 2..(scores.size - 1)){
        if(scores[i]>max){
            max = scores[i]
            countBreakingRecordsMax++
        }else if(min > scores[i]){
            min = scores[i]
            countBreakingRecordsMin++
        }else{
            continue
        }
    }
    return longArrayOf(countBreakingRecordsMin, countBreakingRecordsMax)
}