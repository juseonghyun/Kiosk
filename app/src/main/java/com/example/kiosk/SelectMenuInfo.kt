package com.example.kiosk

class SelectMenuInfo {

    fun selectMenuOperation() {

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
            }
        }
    }

    fun burgersMenuOperation() {
        while (true) {
            var menuSelectInput = readLine()!!.toInt()

            if (menuSelectInput == 0) {
                break

            } else {
                for (i in 0..burgersList.size - 1) {
                    if (menuSelectInput == burgersList[i].id) {
                        DisplayInfo().displayOrderCheck(burgersList[i])
                        checkCart(burgersList[i])
                        return

                    }
                }
            }
        }
    }

    fun sidesMenuOperation() {
        while (true) {
            var menuSelectInput = readLine()!!.toInt()

            if (menuSelectInput == 0) {
                break

            } else {
                for (i in 0..sidesList.size - 1) {
                    if (menuSelectInput == sidesList[i].id) {
                        DisplayInfo().displayOrderCheck(sidesList[i])
                        checkCart(sidesList[i])
                        return
                    }
                }
            }
        }
    }

    fun drinksMenuOperation() {
        while (true) {
            var menuSelectInput = readLine()!!.toInt()

            if (menuSelectInput == 0) {
                break

            } else {
                for (i in 0..drinksList.size - 1) {
                    if (menuSelectInput == drinksList[i].id) {
                        DisplayInfo().displayOrderCheck(drinksList[i])
                        checkCart(drinksList[i])
                        return
                    }
                }
            }
        }
    }

    fun checkCart(dataModel: DataModel) {
        while (true) {
            var checkCart = readLine()!!.toInt()
            if (checkCart == 1) {
                cartList.add(dataModel)
                DisplayInfo().displayAddCart(dataModel)
                break
            } else if (checkCart == 2) {
                break
            }
        }
    }

    fun checkoutOperation(): Boolean {
        while (true) {
            var checkOutInput = readLine()!!.toInt()

            if (checkOutInput == 1) {
                return checkoutMoneyOperation()

            } else if (checkOutInput == 2) {
                break

            }
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