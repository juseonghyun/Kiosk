package com.example.kiosk

class SelectMenuInfo {

    fun selectMenuOperation() {

        try {
            while (true) {
                DisplayInfo().displayMain()
                var menuSelectInput = readLine()!!.toInt()

                if (menuSelectInput == 0) {
                    break

                } else if (menuSelectInput == 1) {
                    DisplayInfo().displayBurger()
                    burgersMenuOperation()

                } else if (menuSelectInput == 2) {
                    DisplayInfo().displaySide()
                    sidesMenuOperation()

                } else if (menuSelectInput == 3) {
                    DisplayInfo().displayDrink()
                    drinksMenuOperation()

                } else if (menuSelectInput == 4) {
                    if (cartList.isEmpty()){
                        DisplayInfo().displayCheckoutEmpty()

                    } else {
                        DisplayInfo().displayCheckOut()

                        if (checkoutOperation()){
                            break
                        }
                    }
                } else {
                    DisplayInfo().displayException()
                }
            }

        }catch (e:NumberFormatException){
            DisplayInfo().displayException()
            selectMenuOperation()
        }
    }

    fun burgersMenuOperation() {
        try {
            while (true) {
                var menuSelectInput = readLine()!!.toInt()

                if (menuSelectInput == 0) {
                    break

                } else if (menuSelectInput == 1 || menuSelectInput == 2){
                    for (i in 0..burgersList.size - 1) {
                        if (menuSelectInput == burgersList[i].id) {
                            DisplayInfo().displayOrderCheck(burgersList[i])
                            checkCart(burgersList[i])
                            return
                        }
                    }
                } else {
                    DisplayInfo().displayException()
                }
            }

        } catch (e:NumberFormatException){
            DisplayInfo().displayException()
            burgersMenuOperation()
        }

    }

    fun sidesMenuOperation() {
        try {
            while (true) {
                var menuSelectInput = readLine()!!.toInt()

                if (menuSelectInput == 0) {
                    break

                } else if (menuSelectInput == 1 || menuSelectInput == 2){
                    for (i in 0..sidesList.size - 1) {
                        if (menuSelectInput == sidesList[i].id) {
                            DisplayInfo().displayOrderCheck(sidesList[i])
                            checkCart(sidesList[i])
                            return
                        }
                    }
                } else {
                    DisplayInfo().displayException()
                }
            }

        }catch (e:NumberFormatException){
            DisplayInfo().displayException()
            sidesMenuOperation()
        }

    }

    fun drinksMenuOperation() {
        try {
            while (true) {
                var menuSelectInput = readLine()!!.toInt()

                if (menuSelectInput == 0) {
                    break

                } else if (menuSelectInput == 1 || menuSelectInput == 2){
                    for (i in 0..drinksList.size - 1) {
                        if (menuSelectInput == drinksList[i].id) {
                            DisplayInfo().displayOrderCheck(drinksList[i])
                            checkCart(drinksList[i])
                            return
                        }
                    }
                } else {
                    DisplayInfo().displayException()
                }
            }

        }catch (e:NumberFormatException){
            DisplayInfo().displayException()
            drinksMenuOperation()
        }

    }


    fun checkCart(dataModel: DataModel) {
        try {
            while (true) {
                var checkCart = readLine()!!.toInt()
                if (checkCart == 1) {
                    cartList.add(dataModel)
                    DisplayInfo().displayAddCart(dataModel)
                    break
                } else if (checkCart == 2) {
                    break
                } else {
                    DisplayInfo().displayException()
                }
            }

        }catch (e:NumberFormatException){
            DisplayInfo().displayException()
            checkCart(dataModel)
        }

    }

    fun checkoutOperation(): Boolean {
        try {
            while (true) {
                var checkOutInput = readLine()!!.toInt()

                if (checkOutInput == 1) {
                    return checkoutMoneyOperation()

                } else if (checkOutInput == 2) {
                    break

                } else {
                    DisplayInfo().displayException()
                }
            }

        }catch (e:NumberFormatException) {
            DisplayInfo().displayException()
            checkoutOperation() // 오류발생 // try-catch문 말고 문자열 예외처리 방법이있는지 or 왜 지금 문자열후 주문하기누르면 함수가 안끝나는지
        }
        return false
    }


    fun checkoutMoneyOperation(): Boolean{
        var totalMoney = 0

        cartList.forEach {
            totalMoney += it.price
        }
        if (myMoney >= totalMoney){
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