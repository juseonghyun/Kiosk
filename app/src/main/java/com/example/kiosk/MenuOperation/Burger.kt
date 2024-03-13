package com.example.kiosk.MenuOperation

import com.example.kiosk.DisplayInfo
import com.example.kiosk.MenuData.BurgerData
import com.example.kiosk.main

class Burger {

    var burgerOperationInput: Int = 0 // 햄버거 입력값 연산
    var checkOrder: Int = 0 // 햄버거메뉴 주문 확인란
    var burger_1 = BurgerData().bulgogiBurger(1)
    var burger_2 = BurgerData().shrimpBurger(1)

    fun burgerOperation(){
        burgerOperationInput = readLine()!!.toInt()
        if (burgerOperationInput == 0){
            return
        } else if (burgerOperationInput == 1){
            bulgogiBurgerCheck()


        } else if (burgerOperationInput == 2){
            shrimpBurgerCheck()

        } else {
            return DisplayInfo().displayBurger()
        }
    }

    fun bulgogiBurgerCheck(){
        DisplayInfo().displayCheckOrder(burger_1)
        checkOrder = readLine()!!.toInt()

        if (checkOrder == 0){
            return

        } else if (checkOrder == 1){
            return main()

        } else {
            return bulgogiBurgerCheck()
        }
    }

    fun shrimpBurgerCheck(){
        DisplayInfo().displayCheckOrder(burger_2)
        checkOrder = readLine()!!.toInt()

        if (checkOrder == 0){
            return

        } else if (checkOrder == 1){
            return main()

        } else {
            return shrimpBurgerCheck()
        }
    }

}