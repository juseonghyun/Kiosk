package com.example.kiosk

fun main() {
    var test = "0"

    while (true){
        DisplayInfo().displayMain()
        var inputMenuSelect = readLine()!!.toInt()
        if (inputMenuSelect == 0){
            println("주문을 종료합니다.")
            break
        } else if (inputMenuSelect == 1){
            DisplayInfo().displayBurger()
            break

        } else if (inputMenuSelect == 2){
            DisplayInfo().displaySide()
            break

        } else if (inputMenuSelect == 3){
            DisplayInfo().displayDrink()
            break

        } else {
            continue
        }

    }

}

