fun main() {

        // 1. Работа с преобразованием строк
        val str1 = "Привет, "
        val str2 = "Друг!"
        val concatenatedString = str1 + str2
        println(concatenatedString)

        // 2. Базовая арифметика и вывод результата в консоль
        val a = 10
        val b = 5
        val sum = a + b
        val difference = a - b
        val product = a * b
        val quotient = a / b
        println("Сумма: $sum, Разность: $difference, Произведение: $product, Частное: $quotient")

        // 3. Примеры интерполяции строк
        val name = "Никита"
        val age = 25
        println("Меня зовут $name и мне $age лет.")

        // 4. Преобразование типов
        val numString = "42"
        val num = numString.toInt()
        println("Число, полученное из строки: $num")

        // 5. Пример условных операторов (if else)
        val x = 15
        if (x > 10) {
            println("x больше 10")
        } else {
            println("x не больше 10")
        }

        // 6. Пример с циклами (for, while)
        for (i in 1..5) {
            println("Итерация $i")
        }

        var counter = 0
        while (counter < 3) {
            println("Число: $counter")
            counter++
        }

        // 7. Пример создания отдельной функции
        fun printHello() {
            println("Отдельня функция была вызвана")
        }
        printHello()

        // 8. Пример работы с массивом
        val numbers = arrayOf(1, 2, 3, 4, 5)
        for (number in numbers) {
            println("Элемент массива: $number")
        }
    }



