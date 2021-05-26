package hackerRank.interviewPreparationKit.arrays

fun  main(){
    for(i in rotLeft(arrayOf(1,2,3,4,5),4)){
        println(i)
    }
}

fun rotLeft(a: Array<Int>, d: Int): Array<Int>{
    var arrayRotated: MutableList<Int> = a.toMutableList()
    for(i in 1..(d)){
        arrayRotated.add(arrayRotated[0])
        arrayRotated.removeAt(0)
    }
    return arrayRotated.toTypedArray()
}