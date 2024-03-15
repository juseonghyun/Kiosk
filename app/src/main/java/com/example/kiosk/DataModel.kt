package com.example.kiosk


data class DataModel(
    val id: Int,
    val name: String,
    val price: Int,
    val desc: String
)

val burgersList = listOf(
    DataModel(1, "불고기버거", 3000, "옛날 그맛 그대로"),
    DataModel(2, "새우버거", 3300, "동해에서 갓 잡아올린 새우버거")
)

val sidesList = listOf(
    DataModel(1, "치즈스틱", 2000, "치즈 쭈욱~ 치즈스틱"),
    DataModel(2, "감자튀김", 1200, "튀긴 감자")
)

var drinksList = listOf(
    DataModel(1, "콜라", 800, "역시 콜라는 팹시"),
    DataModel(2, "사이다", 800, "별이 일곱개")
)

var cartList = ArrayList<DataModel>()