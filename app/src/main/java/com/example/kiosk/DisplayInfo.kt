package com.example.kiosk

import com.example.kiosk.MenuOperation.Burger
import com.example.kiosk.MenuOperation.Drink
import com.example.kiosk.MenuOperation.Side

class DisplayInfo {

    fun displayMain(){
        println("메뉴를 선택해주세요\n" +
                "[1] 햄버거\n" +
                "[2] 사이드\n" +
                "[3] 음료수\n" +
                "[0] 주문종료\n" +
                "Total: 0원")
    }

    fun displayBurger(){
        println("햄버거를 선택해주세요\n" +
                "[1] 불고기버거 | 3000원\n" +
                "[2] 새우버거 | 3500원\n" +
                "[0] 주문종료")
        Burger().burgerOperation()
    }

    fun displaySide(){
        println("사이드를 선택해주세요\n" +
                "[1] 치킨너겟 | 1700원\n" +
                "[2] 감자튀김 | 1200원\n" +
                "[0] 주문종료")
        Side().sideOperation()
    }

    fun displayDrink(){
        println("음료수를 선택해주세요\n" +
                "[1] 콜라 | 800원\n" +
                "[2] 사이다 | 800원\n" +
                "[0] 주문종료")
        Drink().drinkOperation()
    }

    fun displayCheckOrder(name: String){
        println("${name} 을(를) 고르셨습니다. 더 주문하시겠습니까?\n" +
                "[1] 예 | 메인메뉴로 이동\n" +
                "[0] 아니요 | 주문종료")
    }
}