package lesson2;

//import java.lang.reflect.Array;
//import java.util.Arrays;

public class Homework1_Advance {
    public static void main(String[] args) {
        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"

        int number = Integer.valueOf("234");
        String someText = "some_text";
        int stringLength = someText.length();
        System.out.println(stringLength + number);


        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3, b = 5;
        System.out.printf("%.0f", Math.pow((a+b), 2));
        System.out.println();

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)


        System.out.println();

        int[] otherArray1 = new int[]{1, 2, 5, 7, 10};
        int[] otherArray2 = new int[]{2, 3, 2, 17, 15};
        int[] otherArray3 = new int[15];

        for (int x = 0; x < 5; ++x) {
                otherArray3[x] = otherArray1[x];
                otherArray3[x + 5] = otherArray2[x];
                otherArray3[x + 10] = otherArray1[x] * otherArray2[x];
        }
        for (int x : otherArray3) {
            System.out.print(x);
            System.out.print(',');
        }


        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
        System.out.println();

        String str = "Hello world!";
        System.out.println(str.replace("l", "r").toUpperCase().substring(0, 8));

    }
}
