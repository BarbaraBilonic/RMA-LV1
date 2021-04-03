fun main(){
    val game=Game()
    val utilities=Utilities()

    for(i in 1..3){
        if(i!=1){
            println("Input number of each dice you want to lock else input 0")
            val diceToLock= readLine()?:"0"
            if(diceToLock!="0")  game.lockDice(utilities.processDicesToLockUnlock(diceToLock))
            println("Input number of each dice you want to unlock else input 0")
            val diceToUnlock= readLine()?:"0"
            if(diceToUnlock!="0")  game.unlockDice(utilities.processDicesToLockUnlock(diceToUnlock))


        }
        println("Press any key and ENTER to throw the dice.")
        readLine()
        game.throwDice()
        game.setResult()
        utilities.printResult(game.throwResult)
        println(game.checkResult())

      }



}



