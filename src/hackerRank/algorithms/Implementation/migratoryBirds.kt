package hackerRank.algorithms.Implementation

import sun.awt.SunHints
import java.util.HashMap
import java.util.Map


fun main(){
    println(migratoryBirds(arrayOf(2,4,3,2,3,1,2,1,3,3)))
}

fun migratoryBirds(arr: Array<Int>): Int {
    var collection= HashMap<Int,Int>()
    for (i in arr){
        if(collection.containsKey(i)){
            collection.put(i, collection[i]!!+1)
        }else {
            collection.put(i,1)

        }
    }
    var mostBirds = collection.values.toIntArray().max()
    var collectionFiltered = collection.filter{ (k, v) ->  v == mostBirds }.keys.toIntArray()
    return collectionFiltered.min()!!
}
