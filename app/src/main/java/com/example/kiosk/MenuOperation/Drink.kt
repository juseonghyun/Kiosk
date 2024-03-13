package com.example.kiosk.MenuOperation

import com.example.kiosk.DisplayInfo
import com.example.kiosk.MenuData.DrinkData
import com.example.kiosk.main

class Drink {

    var drinkOperationInput: Int = 0 // 음료수 입력값 연산
    var checkOrder: Int =0 // 음료수메뉴 주문 확인란
    var drink_1 = DrinkData().cola(1)
    var drink_2 = DrinkData().cider(1)

    fun drinkOperation(){
        drinkOperationInput = readLine()!!.toInt()
        if (drinkOperationInput == 0){
            return
        } else if (drinkOperationInput == 1){
            colaCheck()

        } else if (drinkOperationInput == 2){
            ciderCheck()

        } else {
            return DisplayInfo().displayDrink()
        }
    }

    fun colaCheck(){
        DisplayInfo().displayCheckOrder(drink_1)
        checkOrder = readLine()!!.toInt()

        if (checkOrder == 0){
            return

        } else if (checkOrder == 1){
            return main()

        } else {
            return colaCheck()
        }
    }

    fun ciderCheck(){
        DisplayInfo().displayCheckOrder(drink_2)
        checkOrder = readLine()!!.toInt()

        if (checkOrder == 0){
            return

        } else if (checkOrder == 1){
            return main()

        } else {
            return ciderCheck()

        }
    }
}