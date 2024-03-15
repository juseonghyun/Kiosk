package com.example.kiosk

class DisplayInfo {

    fun displayMain() {
        println(
            "\n" +
                    "메뉴를 선택해주세요\n" +
                    "[1] 햄버거\n" +
                    "[2] 사이드\n" +
                    "[3] 음료수\n" +
                    "[4] 장바구니\n" +
                    "[0] 주문종료"
        )
    }

    fun displayBurger() {
        println("[ Burgers MENU ]")
        burgersList.forEach {
            println("${it.id}. ${it.name} | ${it.price}원 | ${it.desc}")
        }
        println("0. 뒤로가기")

    }

    fun displaySide() {
        println("[ Sides MENU ]")
        sidesList.forEach {
            println("${it.id}. ${it.name} | ${it.price}원 | ${it.desc}")
        }
        println("0. 뒤로가기")

    }

    fun displayDrink() {
        println("[ Drinks MENU ]")
        drinksList.forEach {
            println("${it.id}. ${it.name} | ${it.price}원 | ${it.desc}")
        }
        println("0. 뒤로가기")

    }

    fun displayOrderCheck(dataModel: DataModel) {
        println("${dataModel.name} | ${dataModel.price}원 | ${dataModel.desc}")
        println(
            "위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                    "1. 확인  2. 취소"
        )
    }

    fun displayAddCart(dataModel: DataModel) {
        println("${dataModel.name} (이)가 장바구니에 추가되었습니다.")
    }

    fun displayCheckOut() {
        var totalMoney = 0
        println(
            "아래와 같이 주문 하시겠습니까?\n" +
                    "[ Orders ]"
        )
        cartList.forEach {
            println("${it.name} | ${it.price}원 | ${it.desc}")
            totalMoney += it.price
        }
        println(
            "[ Total ]\n" +
                    "${totalMoney}원\n" +
                    "[ 현재잔액 ]\n" +
                    "${myMoney}원\n" +
                    "1. 주문 2. 메뉴판"
        )
    }

    fun displayCheckoutMoney() {
        println("주문이 완료되었습니다.")
        println("거스름돈${myMoney}원")
    }

    fun displayCheckoutCheck(oddMoney: Int) {
        println("현재 잔액은 ${myMoney}원 으로 ${oddMoney}원이 부족해서 주문 할 수 없습니다.")

    }

    fun displayCheckoutEmpty() {
        println("장바구니가 비었습니다. 메뉴를 담아주세요.")
    }

    fun displayException() {
        println("유효되는 숫자를 입력해주세요.")
    }

}