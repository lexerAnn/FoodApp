package com.app.foodapp

object MockData2 {
    fun geyAllGadgets():MutableList<FoodNamesSecond> {
        val foodList = mutableListOf<FoodNamesSecond>()

        for (i in 0 until 1) {
            val food1 = FoodNamesSecond(
                "Spicy Holiday Lasagna",
                "Meat Sauce",
                "78 Calories",
                "$9.50", "https://img.buzzfeed.com/buzzfeed-static/static/2019-11/25/19/asset/9f2597ec3231/sub-buzz-1773-1574711145-1.jpg?downsize=700%3A%2A&output-quality=auto&output-format=auto",
                "4.5",
                "20-30 min",
                "This lasagna is too hot for the kitchen! Cool off with the help of Tums.High-fat diet with many proven benefits, especially for weight-loss, health,",
                "https://image.freepik.com/free-vector/mustard-collards_7081-5.jpg",
                "https://image.freepik.com/free-photo/red-onion-whole-isolated-white_146671-19175.jpg",
                "https://as1.ftcdn.net/jpg/02/32/13/60/500_F_232136022_UNf5AKAJgFujgZsMoo2saYiI3UT4aAbv.jpg",
                "https://as2.ftcdn.net/jpg/00/83/96/99/500_F_83969963_Ij0kFcD58cJXcqYbyMooTuqxgkNyjKtr.jpg",
                "https://image.freepik.com/free-vector/fresh-milk-with-text-banner_1308-6819.jpg"
            )
            val food2 = FoodNamesSecond(
                "Cheesy Chicken Fritters",
                " Gluten free",
                "90 Calories",
                "$12.50",
                "https://www.blondelish.com/wp-content/uploads/2019/03/Cheesy-Chicken-Fritters-Recipe-Easy-Keto-Recipe-6-1170x780.jpg",
                "3.7",
                "20-30 min",
                "A Keto diet (a.k.a Ketogenic diet) is a low-carb, high-fat diet with many proven benefits, especially for weight-loss, health, and overall body and mind performance.",
                "https://as2.ftcdn.net/jpg/00/83/96/99/500_F_83969963_Ij0kFcD58cJXcqYbyMooTuqxgkNyjKtr.jpg",
                "https://image.freepik.com/free-photo/red-onion-whole-isolated-white_146671-19175.jpg",
                "https://image.freepik.com/free-vector/mustard-collards_7081-5.jpg",
                "https://image.freepik.com/free-vector/fresh-milk-with-text-banner_1308-6819.jpg",
                "https://as1.ftcdn.net/jpg/02/32/13/60/500_F_232136022_UNf5AKAJgFujgZsMoo2saYiI3UT4aAbv.jpg"
            )

            val food3= FoodNamesSecond(
                "Carrot Sweet Potato Soup",
                " Gluten free",
                "90 Calories",
                "$15.50",
                "https://cookieandkate.com/images/2016/09/thai-carrot-sweet-potato-soup-recipe-550x757.jpg",
                "4.3",
                "20-30 min",
                "This carrot soup is our favorite carrot soup recipe. It's easy to make using pantry-staple ingredients and comes together in less than 30 minutes. ",
                "https://image.freepik.com/free-photo/red-onion-whole-isolated-white_146671-19175.jpg",
                "https://as1.ftcdn.net/jpg/02/32/13/60/500_F_232136022_UNf5AKAJgFujgZsMoo2saYiI3UT4aAbv.jpg",
                "https://as2.ftcdn.net/jpg/00/83/96/99/500_F_83969963_Ij0kFcD58cJXcqYbyMooTuqxgkNyjKtr.jpg",
                "https://image.freepik.com/free-vector/fresh-milk-with-text-banner_1308-6819.jpg",
                "https://image.freepik.com/free-vector/mustard-collards_7081-5.jpg"

                )

            val food4= FoodNamesSecond(
                "Keto Chocolate Cupcakes",
                "Cream Cheese",
                "90 Calories",
                "$10.50",
                "https://www.blondelish.com/wp-content/uploads/2020/09/Keto-Chocolate-Cupcakes-With-Cream-Cheese-Frosting-How-To-Make-Chocolate-Cupcakes-From-Scratch-22-1170x659.jpg",
                "4.1",
                "20-25",
                "Rich, naturally low-carb, and gluten-free Keto Chocolate Cupcakes with Cream Cheese Frosting are about to become your new favorite dessert recipe.",
                "https://image.freepik.com/free-photo/red-onion-whole-isolated-white_146671-19175.jpg",
                "https://as2.ftcdn.net/jpg/00/83/96/99/500_F_83969963_Ij0kFcD58cJXcqYbyMooTuqxgkNyjKtr.jpg",
                "https://as1.ftcdn.net/jpg/02/32/13/60/500_F_232136022_UNf5AKAJgFujgZsMoo2saYiI3UT4aAbv.jpg",
                "https://image.freepik.com/free-vector/fresh-milk-with-text-banner_1308-6819.jpg",
                "https://image.freepik.com/free-vector/mustard-collards_7081-5.jpg"
            )

            foodList.add(food1)
            foodList.add(food2)
            foodList.add(food3)
            foodList.add(food4)


        }

    return foodList
    }

}