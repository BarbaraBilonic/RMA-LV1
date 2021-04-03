class Dealer {
    private var hand= mutableListOf<Int>()
    var sum=0
    var decision=""



    fun addNewCard(card:Int){
        if(card==11) {
            val aceValue=getAceValue()
            hand.add(aceValue)
            sum+=aceValue
        }
        else {
            hand.add(card)
            sum+=card
        }
        checkSum()
    }

    private fun checkSum(){
        if(sum>21) {
            var i=0
            while(hand.count{it==11}>=1 && sum>21 && i<hand.count()-1){
                if(hand[i]==11) hand[i]=1
                sum-=10
                i++

            }

        }

    }

    private fun getAceValue():Int{
        if(sum+11>21) {

            return 1
        }
        else return 11
    }
    fun makeDecision(){
        if (sum<=16) decision="HIT"
        else decision= "STAND"
    }

    fun printCards(){
        if(hand.count()==2){
            println(hand[0])
            println(hand[1])
        }
        else {
            for (h in hand) {
                println("$h")

            }
        }
        println("Sum $sum")
    }
    fun reset() {
        sum = 0
        decision = ""
        hand.clear()
    }

}