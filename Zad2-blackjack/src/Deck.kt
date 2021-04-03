import kotlin.random.Random

class Deck {
    var deck= mutableListOf<Int>()

    init {
        for(i in 1..4){
            for(j in 1..4){
                deck.add(10)
            }
           deck.add(11)
            for(k in 2..9){
                deck.add(k)
            }
        }
    }

    fun dealCard():Int{
        var index= Random.nextInt(0,deck.count()-1)
        var card=deck[index]
        deck.removeAt(index)
        return card

    }
}