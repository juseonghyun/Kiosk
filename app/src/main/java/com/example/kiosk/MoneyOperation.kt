package com.example.kiosk

// 현재 돈을 여기서 수정하세요.
var myMoney = 10000
class MoneyOperation {

    fun checkoutMoneyOperation(): Boolean {

        var totalMoney = 0

        cartList.forEach {
            totalMoney += it.price
        }

        when (myMoney >= totalMoney) {
            true -> {
                myMoney -= totalMoney
                DisplayInfo().displayCheckoutMoney()
                return true
            }

            else -> {
                val oddMoney = totalMoney - myMoney
                DisplayInfo().displayCheckoutCheck(oddMoney)
                return true
            }
        }
    }
}