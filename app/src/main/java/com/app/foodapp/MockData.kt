package com.app.foodapp

object MockData {
    fun geyAllGadgets():MutableList<FoodNames> {
        val foodList = mutableListOf<FoodNames>()

        for (i in 0 until 1) {
            val food1 = FoodNames(
                "Fast Food",
                "https://images.creativemarket.com/0.1.0/ps/7772859/600/400/m2/fpnw/wm0/fast_food-03-.jpg?1581924646&s=7b44aa1de13af5d015850445f190512f"
            )


            val food2 = FoodNames(
                "Vegetables",
                "https://image.freepik.com/free-vector/cute-tomato-cartoon-character_76844-1174.jpg"
            )


            val food3 = FoodNames(
                "Fruits",
                "https://graphicriver.img.customer.envatousercontent.com/files/295060623/05-2018-46-gr-pr-01.jpg?auto=compress%2Cformat&q=80&fit=crop&crop=top&max-h=8000&max-w=590&s=b52ff4bf7e7ec19cba404c14ebb5bb49"
            )


            val food4 = FoodNames(
                "Ice Cream",
                "https://images.creativemarket.com/0.1.0/ps/7772863/600/400/m2/fpnw/wm0/fast_food-07-.jpg?1581924648&s=63581c92de9aae640bb3822295346766"
            )

            foodList.add(food1)
            foodList.add(food3)
            foodList.add(food2)
            foodList.add(food4)

        }

    return foodList
    }

}