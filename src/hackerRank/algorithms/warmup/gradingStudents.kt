package hackerRank.algorithms.warmup

fun main(){
    for(i in gradingStudents(arrayOf(73,67,38,33))){
        println(i)
    }
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
   for(i in grades){
       for (j in 0..100 step 5){
           if(j>i && 3 > (j-i) && j>=40){
                grades[grades.indexOf(i)!!] = j
           }
       }
   }
   return grades

}