package com.agarcia.myfirstandroidapp.data.dummy

import android.view.MenuItem
import com.agarcia.myfirstandroidapp.data.model.Restaurant
import com.agarcia.myfirstandroidapp.data.model.MenuItem

val dummyRestaurants = listOf(
  Restaurant(
    id = 1,
    name = "La Taquería",
    description = "Disfruta de tacos de carne al pastor y salsas caseras.",
    category = "Comida Mexicana",
    backdropUrl = "https://example.com/taco.jpg",
    imageUrl = "https://example.com/taco.jpg",
    menu = listOf(
      MenuItem(1, "Taco al Pastor", "Carne al pastor con piña y salsa verde", "https://example.com/taco_al_pastor.jpg"),
      MenuItem(2, "Taco de Barbacoa", "Carne de res con salsa roja", "https://example.com/taco_barbacoa.jpg")
    )
  ),
  Restaurant(
    id = 2,
    name = "Pizzeria Da Marco",
    description = "Pizzas tradicionales de Nápoles, cocinadas al horno de leña.",
    category = "Comida Italiana",
    backdropUrl = "https://example.com/pizza.jpg",
    imageUrl = "https://example.com/pizza.jpg",
    menu = listOf(
      MenuItem(3, "Pizza Margherita", "Tomate, mozzarella y albahaca", "https://example.com/pizza_margherita.jpg"),
      MenuItem(4, "Pizza Calzone", "Relleno de jamón, queso y tomate", "https://example.com/pizza_calzone.jpg")
    )
  ),
  Restaurant(
    id = 3,
    name = "Sushimania",
    description = "Deliciosos rollos de sushi y platos típicos japoneses.",
    category = "Comida Japonesa",
    backdropUrl = "https://example.com/sushi.jpg",
    imageUrl = "https://example.com/sushi.jpg",
    menu = listOf(
      MenuItem(5, "Sushi Roll de Atún", "Atún fresco con aguacate y arroz", "https://example.com/sushi_roll_atun.jpg"),
      MenuItem(6, "Tempura", "Verduras y mariscos empanizados y fritos", "https://example.com/tempura.jpg")
    )
  ),
  Restaurant(
    id = 4,
    name = "La Hamburguesería",
    description = "Hamburguesas gourmet con ingredientes premium.",
    category = "Comida Rápida",
    backdropUrl = "https://example.com/burger.jpg",
    imageUrl = "https://example.com/burger.jpg",
    menu = listOf(
      MenuItem(7, "Hamburguesa BBQ", "Carne de res, cebolla caramelizada, queso cheddar y salsa BBQ", "https://example.com/hamburguesa_bqq.jpg"),
      MenuItem(8, "Hamburguesa Vegetariana", "Hamburguesa de garbanzo con aguacate y mayonesa vegana", "https://example.com/hamburguesa_vegetariana.jpg")
    )
  ),
  Restaurant(
    id = 5,
    name = "Sushi & Ramen",
    description = "Platos tradicionales japoneses, como sushi y ramen.",
    category = "Comida Japonesa",
    backdropUrl = "https://example.com/ramen.jpg",
    imageUrl = "https://example.com/ramen.jpg",
    menu = listOf(
      MenuItem(9, "Ramen de Cerdo", "Sopa de ramen con cerdo, huevo y cebollín", "https://example.com/ramen_cerdo.jpg"),
      MenuItem(10, "Sushi California Roll", "Sushi de aguacate, pepino y cangrejo", "https://example.com/sushi_california.jpg")
    )
  ),
  Restaurant(
    id = 6,
    name = "Veggie Delight",
    description = "Comida saludable basada en vegetales frescos.",
    category = "Comida Saludable",
    backdropUrl = "https://example.com/veggie.jpg",
    imageUrl = "https://example.com/veggie.jpg",
    menu = listOf(
      MenuItem(11, "Bowl de Quinoa", "Quinoa con aguacate, espinacas y aderezo de limón", "https://example.com/quinoa_bowl.jpg"),
      MenuItem(12, "Ensalada Mediterránea", "Tomates, pepino, aceitunas, queso feta y orégano", "https://example.com/ensalada_mediterranea.jpg")
    )
  ),
  Restaurant(
    id = 7,
    name = "Sweet Temptations",
    description = "Deliciosos postres, desde pasteles hasta helados.",
    category = "Postres",
    backdropUrl = "https://example.com/dessert.jpg",
    imageUrl = "https://example.com/dessert.jpg",
    menu = listOf(
      MenuItem(13, "Pastel de Chocolate", "Pastel de chocolate con crema de ganache", "https://example.com/pastel_chocolate.jpg"),
      MenuItem(14, "Helado de Vainilla", "Helado cremoso de vainilla con sirope de caramelo", "https://example.com/helado_vainilla.jpg")
    )
  ),
  Restaurant(
    id = 8,
    name = "The Drink Bar",
    description = "Variedad de cócteles y bebidas especiales.",
    category = "Bebidas",
    backdropUrl = "https://example.com/drinks.jpg",
    imageUrl = "https://example.com/drinks.jpg",
    menu = listOf(
      MenuItem(15, "Mojito", "Cóctel de ron, menta y lima", "https://example.com/mojito.jpg"),
      MenuItem(16, "Piña Colada", "Cóctel de piña, ron y crema de coco", "https://example.com/pina_colada.jpg")
    )
  )
)
