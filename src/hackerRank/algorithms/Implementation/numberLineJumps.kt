package hackerRank.algorithms.Implementation

fun main(){
}

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if((x2>x1) && (v2>v1)){
        return "NO"
    }else if(((v2-v1)!=0) && ((x2-x1)%(v1-v2)==0)){
        return "YES"
    }else{
        return "NO"
    }

}
