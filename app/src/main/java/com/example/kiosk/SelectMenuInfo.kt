package com.example.kiosk

class SelectMenuInfo {

    fun selectMainMenu() {

        try {
            while (true) {
                DisplayInfo().displayMain()
                var menuSelectInput = readLine()!!.toInt()

                if (menuSelectInput == 0) {
                    break

                } else if (menuSelectInput == 1) {
                    DisplayInfo().displayBurger()
                    selectBurgersMenu()

                } else if (menuSelectInput == 2) {
                    DisplayInfo().displaySide()
                    selectSidesMenu()

                } else if (menuSelectInput == 3) {
                    DisplayInfo().displayDrink()
                    selectDrinksMenu()

                } else if (menuSelectInput == 4) {
                    if (cartList.isEmpty()) {
                        DisplayInfo().displayCheckoutEmpty()

                    } else {
                        DisplayInfo().displayCheckOut()
                        if (checkoutOperation()) {
                            break
                        }
                    }

                } else {
                    DisplayInfo().displayException()

                }
            }

        } catch (e: NumberFormatException) {
            DisplayInfo().displayException()
            selectMainMenu()

        }
    }

    fun selectBurgersMenu() {
        try {
            while (true) {
                var menuSelectInput = readLine()!!.toInt()

                if (menuSelectInput == 0) {
                    break

                } else if (menuSelectInput == 1 || menuSelectInput == 2) {
                    for (i in 0..burgersList.size - 1) {
                        if (menuSelectInput == burgersList[i].id) {
                            DisplayInfo().displayOrderCheck(burgersList[i])
                            selectCartCheck(burgersList[i])
                            return
                        }
                    }

                } else {
                    DisplayInfo().displayException()

                }
            }

        } catch (e: NumberFormatException) {
            DisplayInfo().displayException()
            selectBurgersMenu()

        }

    }

    fun selectSidesMenu() {
        try {
            while (true) {
                var menuSelectInput = readLine()!!.toInt()

                if (menuSelectInput == 0) {
                    break

                } else if (menuSelectInput == 1 || menuSelectInput == 2) {
                    for (i in 0..sidesList.size - 1) {
                        if (menuSelectInput == sidesList[i].id) {
                            DisplayInfo().displayOrderCheck(sidesList[i])
                            selectCartCheck(sidesList[i])
                            return
                        }
                    }

                } else {
                    DisplayInfo().displayException()

                }
            }

        } catch (e: NumberFormatException) {
            DisplayInfo().displayException()
            selectSidesMenu()

        }

    }

    fun selectDrinksMenu() {
        try {
            while (true) {
                var menuSelectInput = readLine()!!.toInt()

                if (menuSelectInput == 0) {
                    break

                } else if (menuSelectInput == 1 || menuSelectInput == 2) {

                    for (i in 0..drinksList.size - 1) {
                        if (menuSelectInput == drinksList[i].id) {
                            DisplayInfo().displayOrderCheck(drinksList[i])
                            selectCartCheck(drinksList[i])
                            return
                        }
                    }

                } else {
                    DisplayInfo().displayException()

                }
            }

        } catch (e: NumberFormatException) {
            DisplayInfo().displayException()
            selectDrinksMenu()

        }
    }

    fun selectCartCheck(dataModel: DataModel) {
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

        } catch (e: NumberFormatException) {
            DisplayInfo().displayException()
            selectCartCheck(dataModel)

        }
    }

    fun checkoutOperation(): Boolean {
        try {
            while (true) {
                var checkOutInput = readLine()!!.toInt()

                if (checkOutInput == 1) {
                    return MoneyOperation().checkoutMoneyOperation()

                } else if (checkOutInput == 2) {
                    break

                } else {
                    DisplayInfo().displayException()

                }
            }

        } catch (e: NumberFormatException) {
            DisplayInfo().displayException()
            checkoutOperation()

        }
        return true

    }
}