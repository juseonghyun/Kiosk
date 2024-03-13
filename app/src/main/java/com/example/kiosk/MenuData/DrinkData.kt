package com.example.kiosk.MenuData

class DrinkData {

    var name: String = ""
    var price: String = ""

    fun cola(flag: Int): String{
        name = "콜라"
        price = "800"

        if (flag == 1){
            return name
        } else {
            return price
        }
    }

    fun cider(flag: Int): String{
        name = "사이다"
        price = "800"

        if (flag == 1){
            return name
        } else {
            return price
        }
    }
}
//함수에다가 가격을 return