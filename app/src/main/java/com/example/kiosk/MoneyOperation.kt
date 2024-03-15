package com.example.kiosk

class MoneyOperation {

    fun checkoutMoneyOperation(): Boolean {
        var totalMoney = 0

        cartList.forEach {
            totalMoney += it.price
        }

        if (myMoney >= totalMoney) {
            myMoney -= totalMoney
            DisplayInfo().displayCheckoutMoney()
            return true

        } else {
            val oddMoney = totalMoney - myMoney
            DisplayInfo().displayCheckoutCheck(oddMoney)
            return true

        }
    }
}