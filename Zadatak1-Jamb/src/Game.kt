class Game {
    private var dice= mutableListOf(Dice(),Dice(),Dice(),Dice(),Dice(),Dice())
    var throwResult: String=""

    fun throwDice(){
        for (d in dice){
            d.throwDice()
        }

        setResult()

    }

    fun lockDice(dicesToLock : List<Int>){
        for(i in dicesToLock){
            dice[i-1].locked=true
        }
    }

    fun unlockDice(dicesToUnlock : List<Int>){
        for(i in dicesToUnlock){
            dice[i-1].locked=false
        }
    }

    fun setResult(){
        throwResult=""
        for(d in dice){
            throwResult+=(d.value).toString()
        }

    }


    fun checkResult():String{

        for(i in 1..6){
            if(dice.count{it.value==i}>4){
                return "Yamb"
            }

            if(dice.count{it.value==i}==4){
                return "Poker"
            }
        }
        val scale1=listOf(1,2,3,4,5)
        val scale2= listOf(2,3,4,5,6)
        val values= mutableListOf<Int>()
        for(d in dice){
            values.add(d.value)
        }
        if(values.containsAll(scale1) || values.containsAll(scale2)) return "Scale"
        return ""

    }

}