fun main(){
    var grade : Int = 74

    if((grade >=96)&&(grade <=100)){
        println("1.00")
    }else if((grade >=86)&&(grade <=95)){
        println("1.75")
    }else if((grade >=76)&&(grade <=85)){
        println("2,25")
    }else if(grade > 75 ){
        println("5.0")
    }else{
        println("invalid grade!")

    }
    var gender : String = "X"
    if(gender == "M"){
     println("Male")
    }else if(gender =="F"){
    println("Female")
    }else{
        println("Invalid choice")



    }

    //range
    var idNumber : Int = 1
    if((idNumber >=1)&&(idNumber <=3) ){
        println("valid id number")
        println("SUCESS!!!!!!")
    }

    println("Line ends")

}
