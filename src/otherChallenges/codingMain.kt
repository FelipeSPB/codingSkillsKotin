package otherChallenges

fun main(){
    piramydCreator(4);
}

fun piramydCreator(qtdLines: Int){
    var stringPyramid: String = ""
    for (i in 1..qtdLines){
        stringPyramid+="#"
        println(
            lineCreator((qtdLines-stringPyramid.length),stringPyramid).reversed()+"  "+
                lineCreator((qtdLines-stringPyramid.length),stringPyramid)
        )
    }
}

fun lineCreator(qtdSpaces: Int, string: String): String{
    var stringReturn: String = string
    var space: String = ""
    for (i in 1..qtdSpaces){
        space+=" "
    }
    return stringReturn + space;
}