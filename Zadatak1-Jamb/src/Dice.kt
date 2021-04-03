import kotlin.random.Random

class Dice{
    var value : Int = 0
    var locked: Boolean= false

    fun throwDice(){

        if(!locked) {

           value = Random.nextInt(1, 6)



        }
    }

}