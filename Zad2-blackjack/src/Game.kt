fun main(){
    val player=Player()
    val dealer=Dealer()
    val deck=Deck()
    var firstTurn=true
    var gameOver=false
    val gameFunctions=GameFunctions()

    while(!gameOver) {
        if (firstTurn) {
            player.addNewCard(deck.dealCard())
            player.addNewCard(deck.dealCard())
            dealer.addNewCard(deck.dealCard())
            dealer.addNewCard(deck.dealCard())
            println("Player:")
            player.printCards()
            println("Dealer:")
            dealer.printCards()
            firstTurn=false

        } else {
            if (player.decision == "HIT") {
                player.addNewCard(deck.dealCard())

            }
            println("Player:")
            player.printCards()

            if (dealer.decision == "HIT") {
                dealer.addNewCard(deck.dealCard())

            }
            println("DEALER:")
            dealer.printCards()

        }
        val result = gameFunctions.checkSums(dealer.sum,player.sum,player.decision)
        when (result) {
            "" -> gameOver = false
            else -> gameOver = true
        }
        println(result)
        if(result=="") {
            player.makeDecision()
            dealer.makeDecision()


        }else{
            println("Input yes if you want to play again and no if you don't.")
            val answer= readLine()?:"no"
            if(answer=="yes"){
                gameOver=false
                player.reset()
                dealer.reset()
                firstTurn=true
            }
        }


    }
}
