package com.example.kiosk.MenuOperation

import com.example.kiosk.DisplayInfo
import com.example.kiosk.MenuData.SideData
import com.example.kiosk.main

class Side {

    var sideOperationInput: Int = 0 // 사이드 입력값 연산
    var checkOrder: Int =0 // 사이드메뉴 주문 확인란
    var side_1 = SideData()
    var side_2 = SideData()

    fun sideOperation(){
        sideOperationInput = readLine()!!.toInt()
        if (sideOperationInput == 0){
            return
        } else if (sideOperationInput == 1){
            chickenNuggetsCheck()
            DisplayInfo().displayMain()

        } else if (sideOperationInput == 2){
            frenchFriesCheck()

        } else {
            return DisplayInfo().displaySide()
        }
    }

    fun chickenNuggetsCheck(){
        DisplayInfo().displayCheckOrder(side_1.name)
        checkOrder = readLine()!!.toInt()

        if (checkOrder == 0){
            return

        } else if (checkOrder == 1){
            return main()

        } else {
            return chickenNuggetsCheck()
        }
    }

    fun frenchFriesCheck(){
        DisplayInfo().displayCheckOrder(side_2.name)
        checkOrder = readLine()!!.toInt()

        if (checkOrder == 0){
            return

        } else if (checkOrder == 1){
            return main()

        } else {
            return frenchFriesCheck()
        }
    }
}