package com.example.kiosk

class SelectMenuInfo {

    fun selectMainMenu() {

        try {
            while (true) {
                DisplayInfo().displayMain()
                var menuSelectInput = readln().toInt()

                when (menuSelectInput) {
                    0 -> {
                        break
                    }

                    1 -> {
                        DisplayInfo().displayBurger()
                        selectBurgersMenu()
                    }

                    2 -> {
                        DisplayInfo().displaySide()
                        selectSidesMenu()
                    }

                    3 -> {
                        DisplayInfo().displayDrink()
                        selectDrinksMenu()
                    }

                    4 -> {
                        when (cartList.isEmpty()) {
                            true -> {
                                DisplayInfo().displayCheckoutEmpty()
                            }

                            else -> {
                                DisplayInfo().displayCheckOut()

                                when (checkoutOperation()) {
                                    true -> {
                                        break
                                    }

                                    else -> {
                                        continue
                                    }
                                }

                            }
                        }

                    }

                    else -> {
                        DisplayInfo().displayException()

                    }
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
                var menuSelectInput = readln().toInt()

                when (menuSelectInput) {
                    0 -> {
                        break
                    }

                    1, 2 -> {
                        for (i in 0..burgersList.size - 1) {
                            when (menuSelectInput) {
                                burgersList[i].id -> {
                                    DisplayInfo().displayOrderCheck(burgersList[i])
                                    selectCartCheck(burgersList[i])
                                    return
                                }
                            }
                        }

                    }

                    else -> {
                        DisplayInfo().displayException()

                    }
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

                when (menuSelectInput) {
                    0 -> {
                        break
                    }

                    1, 2 -> {
                        for (i in 0..sidesList.size - 1) {
                            when (menuSelectInput) {
                                sidesList[i].id -> {
                                    DisplayInfo().displayOrderCheck(sidesList[i])
                                    selectCartCheck(sidesList[i])
                                    return
                                }
                            }
                        }

                    }

                    else -> {
                        DisplayInfo().displayException()

                    }
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
                var menuSelectInput = readln().toInt()

                when (menuSelectInput) {
                    0 -> {
                        break
                    }

                    1, 2 -> {
                        for (i in 0..drinksList.size - 1) {
                            when (menuSelectInput) {
                                drinksList[i].id -> {
                                    DisplayInfo().displayOrderCheck(drinksList[i])
                                    selectCartCheck(drinksList[i])
                                    return
                                }
                            }
                        }

                    }

                    else -> {
                        DisplayInfo().displayException()

                    }
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
                var checkCart = readln().toInt()

                when (checkCart) {
                    1 -> {
                        cartList.add(dataModel)
                        DisplayInfo().displayAddCart(dataModel)
                        break
                    }

                    2 -> {
                        break
                    }

                    else -> {
                        DisplayInfo().displayException()

                    }
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
                var checkOutInput = readln().toInt()

                when (checkOutInput) {
                    1 -> {
                        return MoneyOperation().checkoutMoneyOperation()
                    }

                    2 -> {
                        return false
                        break
                    }

                    else -> {
                        DisplayInfo().displayException()
                    }
                }
            }

        } catch (e: NumberFormatException) {
            DisplayInfo().displayException()
            checkoutOperation()

        }
        return true

    }
}