package com.example.kiosk.MenuData

class SideData {

    var name: String = ""
    var price: String = ""

    fun chickenNuggets(flag: Int): String{
        name = "치킨너겟"
        price = "1700"

        if (flag == 1){
            return name
        } else {
            return price
        }
    }

    fun frenchFries(flag: Int): String{
        name = "감자튀김"
        price = "1200"

        if (flag == 1){
            return name
        } else {
            return price
        }
    }
}

// 공통함수에 exte
