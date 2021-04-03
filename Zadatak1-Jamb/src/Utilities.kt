class Utilities {
    fun processDicesToLockUnlock(diceToLockUnlock:String):List<Int>{
        val indices= mutableListOf<Int>()
        for(i in 0 .. diceToLockUnlock.length step 2){
            indices.add(diceToLockUnlock[i].toInt()-48)

        }

        return indices
    }

    fun printResult(result:String){
        for(i in 1..6){
            val x=result[i-1]
            println("Dice $i: $x")
        }

    }
}