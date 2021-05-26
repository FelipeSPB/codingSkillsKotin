package hackerRank.algorithms.Implementation

fun main(){
    println(hurdleRace(4,arrayOf(1,6,3,5,2)))
}

fun hurdleRace(k: Int, height: Array<Int>): Int {
    var numberPotions = (height.max()!!) - k
    if(numberPotions>0){
        return numberPotions
    }else{
        return 0
    }
}