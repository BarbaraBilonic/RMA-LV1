class Player {
    private var hand= mutableListOf<Int>()
    var sum=0
    var decision=""
    private var numberOfAces=0



    fun addNewCard(card:Int){
        if(card==11) {
            val aceValue=getAceValue()
            hand.add(aceValue)
            sum+=aceValue
            numberOfAces++
        }
        else {
            hand.add(card)
            sum+=card
        }
        checkSum()
        }

    private fun  checkSum(): Int{
        if(sum>21) {
            var i=0
            while(hand.count{it==11}>=1 && sum>21 && i<hand.count()-1){
                if(hand[i]==11) hand[i]=1
                sum-=10
                i++

            }

        }
         return 0
    }

   private  fun getAceValue():Int{
        if(((sum>10 && numberOfAces==0) || (sum-numberOfAces>10 && numberOfAces>=1)) && sum-10!=21){

            return 1
        }
        else return 11
    }

     fun makeDecision()  {
        println("Do you want to HIT or STAND?")
         decision= readLine()?:"HIT"
        decision.toUpperCase()

    }
    fun printCards(){


            for (h in hand) {
                println("$h")

            }
        println("Sum $sum")

    }
    fun reset(){
        sum=0
        decision=""
        numberOfAces=0
      hand.clear()
    }
}