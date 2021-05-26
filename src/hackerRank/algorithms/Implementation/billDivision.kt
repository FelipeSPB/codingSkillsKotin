package hackerRank.algorithms.Implementation

fun main(){
    bonAppetit(arrayOf(3,10,2,9),1,7)
}

fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    var arrayWhatAnnaEat = bill.toMutableList()
    arrayWhatAnnaEat.removeAt(k)
    var billPerPerson = (arrayWhatAnnaEat.sum()/2)
    var annaHasToPay =  b - billPerPerson
    if(annaHasToPay==0){
        println("Bon Appetit")
    }else{
        println(annaHasToPay)
    }

}