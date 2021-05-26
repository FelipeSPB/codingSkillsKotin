package hackerRank.algorithms.Implementation

fun main(){
    println(catAndMouse(2, 75, 7))
}

fun catAndMouse(x: Int, y: Int, z: Int): String? {
   if(Math.abs(x-z) < Math.abs(y-z)){
       return "Cat A"
   }else if(Math.abs(y-z)  < Math.abs(x-z)){
       return "Cat B"
   }else{
       return "Mouse C"
   }
}
