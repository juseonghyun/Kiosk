package com.example.kiosk.MenuData

class BurgerData {

    var name: String = ""
    var price: String = ""

    fun bulgogiBurger(flag: Int): String{
        name = "불고기버거"
        price = "3000"

        if (flag == 1){
            return name
        } else {
            return price
        }
    }

    fun shrimpBurger(flag: Int): String{
        name = "새우버거"
        price = "3500"

        if (flag == 1){
            return name
        } else {
            return price
        }
    }
}