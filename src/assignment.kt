fun main() {
    var person=Human("sharon",21,50)
    person.eat(foodWeight = 4)
    person.birthday()

    person.speak("I mobile development")
    var jackline=User("jackline","maina","we345","0748653826",987754)
    println(jackline.firstname)
    println(jackline.email)




}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight: Int){
        println("I am eating $foodWeight kgs of food")
        weight=weight+foodWeight


    }
    fun speak(speech:String){
        println("I love mobile development")
    }
    fun birthday(){
        age =age++
        println(age)
    }}
data class User(var firstname:String,var lastname:String,var email:String,var phonenumber: String,var password:Int)

