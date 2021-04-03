class GameFunctions {
    fun checkSums(dealerSum:Int, playerSum: Int, playerDecision:String):String{
        var result=""
        if(playerSum>21 || (dealerSum==21 && dealerSum!=playerSum) || (playerDecision=="STAND" && dealerSum>16 && dealerSum>playerSum && dealerSum<21)) result ="Player loses"
        else if((dealerSum in 17..playerSum) || dealerSum>21 || playerSum==21){
            result ="Player wins"
        }else if(playerSum==dealerSum && ((playerSum==21 || playerSum>21) || playerDecision=="STAND")){
            result ="Nobody wins"
        }
        return result
    }


}