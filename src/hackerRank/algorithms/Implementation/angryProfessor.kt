package hackerRank.algorithms.Implementation

fun main(){
    println(angryProfessor(3,arrayOf(-1,-3,4,2)))

}

fun angryProfessor(k: Int, a: Array<Int>): String {
    var countOnTime: Int = 0
    for (i in a){
        if (0>=i){
            countOnTime++
        }
    }
    if(countOnTime>=k){
        return "NO"
    }else{
        return "YES"
    }
}