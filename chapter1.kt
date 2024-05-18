/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    println("Hello, Android ")
    
    val x = 1
    val y =3
    
    println(x)
    val z = x+y
    println(z)
    
    val name = "Danial"
    //name = "Danial Akmal"
    println(name)
    
    var fullName = "Danial"
    fullName = "Danial Akmal"
    println(fullName)
    
    
    val address:String = "Shah Alam"
    println(address)
    
    var jantina:Char = 'L'
    println(jantina)
    
    val message = "My name is "+name+", I live in "+address
    println(message)
    
    
    val anotherMessage:String = "My name is $name and I live in $address"
    println(anotherMessage)
    
    
    var num1:Double = 9.0
    var num2:Int = 5
    
    var sum = num1+num2
    println(sum)
    
    
    var minus = num1 - num2
    println(minus)
    
    var product = num1 * num2
    println(product)
    
    var division = num1 / num2
    println(division)
    
    var modulo = num1 % num2
    println(modulo)
    
    var eaten = true
    var tired:Boolean = false
    
    println(eaten && tired)
    println(eaten || tired)
    println(!eaten)
    
     
    var profession = null
    
    var newProfession:String? = null
    println(newProfession)
    println(profession)
    newProfession = "Trainer"
    println(newProfession)
    
    var tinggi = 170
    var berat = 70
    var bmi = berat / ((tinggi / 100) * (tinggi / 100))
    println(bmi)
    
    
    var scores = arrayOf(70,90,100,80,85,60)
    
    println(scores[0])
    println(scores[1])
    println(scores.size)
    

    
}
