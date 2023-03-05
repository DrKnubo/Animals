interface Roamable{
    fun roam()
}

abstract class Animal : Roamable {
   abstract val image : String
   abstract val food : String
   abstract val habitat : String
    var hunger = 10

    abstract fun makeNoise()
    //open fun makeNoise(){println("The Animal is making a noise")}
    abstract fun eat() //{println("The Animal is eating")}


    override fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
}
class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"
    override fun makeNoise() {
        println("Grunt! Grunt!")
    }
    override fun eat() {
        println("The Hippo is eating $food.")
    }
}
abstract class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise() {
        println("Hooooowl!")
    }
    override fun eat() {
        println("The Wolf is eating $food.")
    }
}

class Fox : Canine(){
    override val image = "fox.jpg"
    override val food = "small animals"
    override val habitat = "foxland"

    override fun makeNoise() {
        println("What does the fox say?!")
    }

    override fun eat(){
        println("The Fox is eating $food.")
    }
}


abstract class Feline : Animal(){
    override fun roam() {
        println("The Feline is roaming")
    }
}



class Lion : Feline(){
    override val image = "lion.jpg"
    override val food = "meat"
    override val habitat = "Savanah"

    override fun makeNoise() {
        println("Roarr!")
    }
    override fun eat(){
        println("The Lion eats $food.")
    }
}

class Cheetah : Feline() {
    //Cheetah Code
    override val image = "cheetah.jpg"
    override val food = "meat"
    override val habitat = "Savanah"

    override fun makeNoise() {
        println("Roarr!")
    }

    override fun eat() {
        println("The Cheetah eats $food.")
    }
}

class Lynx : Feline() {
    //Lynx Code
    override val image = "lynx.jpg"
    override val food = "meat"
    override val habitat = "Savanah"

    override fun makeNoise() {
        println("Roarr!")
    }

    override fun eat() {
        println("The Lynx eats $food.")
    }
}


class Vehicle : Roamable{
    override fun roam() {
        println("The Vehicle is roaming")
    }
}

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

fun main(args: Array<String>) {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf = Wolf()
    val nWolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
    nWolf.roam()
    nWolf.makeNoise()
    nWolf.sleep()
    val nHippo = Hippo()
    nHippo.eat()
    println("neuer Text")

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables){
        item.roam()
        if (item is Animal){
            item.eat()
        }
    }

}