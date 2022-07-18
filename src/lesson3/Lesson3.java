package lesson3;

/**
 * Урок №2 - Условные операторы, сравнение примитивов и объектов, циклы
 */
public class Lesson3 {
    public static void main(String[] args) {
        int number1 = 11;
        int number2 = 11;

        // Выполнить блок кода, если результат true
        if (number1 == number2) {
            //код
        }

        // Внутри скобок ожидается значение: либо true, либо false. Других значений там быть не может.
        boolean result = number1 == number2;
        if (result) {
            System.out.println("Числа равны");
        }

        // Выполнить блок кода, если результат true, иначе выполнить другой блок кода
        if (number1 == number2) {
            // код если равны
        } else {
            // код если не равны
        }

        // Если число больше нуля
        if (number1 > 0) {
            // Число положительное
            // Если число равно нулю
        } else if (number1 == 0) {
            // Ноль
            // Иначе
        } else {
            // Число отрицательное
        }

        // Сравнение примитивов происходит через ==
        int number3 = 3;
        int number4 = 4;
        boolean primitivesEqual = number3 == number4;

        // Сравнение объектов по ссылке (т.е. ссылаются переменные на один и тот же объект)
        String name1 = new String("Yuri");
        String name2 = new String("Yuri");
        if (name1 == name2) {
            System.out.println("Это один и тот же объект");
        } else {
            System.out.println("Это объекты разные, т.е. ссылки на объекты другие");
        }

        // Сравнение ссылочных типов по значению происходит через функцию equals
        // Внимание у каждого класса своя реализация equals
        // (если equals не переопределен, то по умолчанию сравнение по ссылкам)
        boolean objectEqual = name1.equals(name2);

        // Булева логика
        // Оператор && (и) - два значения должны быть true, иначе false
        //
        // Пример из реальной жизни: Мама послала сына в магазин. Говорит купи: хлеб И молоко. Рассмотрим две ситуации:
        // 1. Сын купил молоко(true) и хлеб(true). Значит он выполнил задачу (true).
        boolean isTrue = true && true;
        // 2. Сын купил молоко(true) но не купил хлеб(false). Значит он не выполнил задачу(false).
        boolean isFalse = true && false;

        // Оператор || (или) - одно из значений должно быть true, иначе false.
        // Внимание если оба значения true, то будет true
        //
        // Пример из реальной жизни: Мама послала сына в магазин. Говорит купи: купи сладкого к чаю.
        // В магазине есть пряники и конфеты. Рассмотрим 3 ситуации:
        // 1. Сын купил пряники(true) и конфеты(true). Задача выполнена: сладкое есть - true
        boolean isTrue1 = true || true;
        // 2. Сын купил пряники(true), но не купил конфеты. Задача выполнена: сладкое есть - true
        boolean isTrue2 = true || false;
        // 3. Сын не купил пряники (false) и не купил конфеты(false). Задача не выполнена: сладкого нет - false
        boolean isFalse1 = false || false;

        // Оператор ! (не) - "переворачивает" значение - из true делает false и наоборот
        boolean isTrue3 = !false;
        boolean isFalse2 = !true;

        // Так делать НЕ НАДО
        if (result == true) {

        }

        // Циклы - нужны для многократного повторения кода, при каком либо условии

        // Конструкция for each. Разберем синтаксис
        // for ( (тип данных из массива) (имя переменной) : массив) { какой то код}
        // Пример: Перебор элементов массива
        int[] numbers = {1, 2, 3, 4};
        for (int num: numbers) {
            // Разовое выполнение кода внутри цикла называется итерацией
            System.out.println(num);
        }

        // Конструкция for i. Разберем синтаксис
        // for ( (тип данных) (имя переменной) = (первоначальное значение); (условие выполнения кода); (действие с переменной) ) { какой то код }
        // Пример: Перебор чисел
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Конструкция while. Разберем синтаксис
        // while (условие) {какой то код}
        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k++;
        }

        // Прерывание циклов - иногда нужно закончить действие какого то цикла, не перебирая все элементы массива
        // за это отвечает слово break;
        // Пример: распечатать первое число, которое больше 3
        for (int i = 0; i < 10; i++) {
            if (i > 3) {
                System.out.println(i);
                break;
            }
        }

        //Прерывание итерации
        for (int i = 0; i < 10; i++) {
            if (i > 5) {
                continue;
            }
            System.out.println(i);
        }

        // Бесконечный цикл - ситуация, при котором нет условия окончания цикла, и он запускается снова и снова
        //        while (true) {
        //            System.out.println("hi");
        //        }

        // Для решения проблемы бесконечного цикла используем break и внешнюю переменную;
        int index = 0;
        while (true) {
            System.out.println("hi");
            ++index;
            if (index > 20) {
                break;
            }
        }
    }
}