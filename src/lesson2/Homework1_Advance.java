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

        int[] array1 = new int[]{1, 2, 5, 7, 10};
        int[] array2 = new int[]{2, 3, 2, 17, 15};
        int[] array3 = new int[15];

        for (int x = 0; x < 5; ++x)
            array3[x] = array1[x];

        for (int x = 5; x < 10; ++x)
            array3[x] = array2[x - 5];

        for (int x = 10; x < 15; ++x)
            array3[x] = array1[x - 10] * array2[x - 10];

        for (int x : array3) {
            System.out.print(x);
            System.out.print(',');
        }
//--------------------------2й вариант----------------------------------------
        System.out.println();

        int[] otherArray1 = new int[]{1, 2, 5, 7, 10};
        int[] otherArray2 = new int[]{2, 3, 2, 17, 15};
        int len = otherArray1.length * 3;
        int[] otherArray3 = new int[len];

        for (int x = 0; x < len; ++x) {
            if (x < 5)
                otherArray3[x] = otherArray1[x];
            else if (x >= 5 && x < 10 )
                otherArray3[x] = otherArray2[x - 5];
            else
                otherArray3[x] = otherArray1[x - 10] * otherArray2[x - 10];
        }
        for (int x : otherArray3) {
            System.out.print(x);
            System.out.print(',');
        }


        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
        System.out.println();

        String str = "Hello world!";
        String newStr = str.replace("l", "r");
        String newStr1 = newStr.toUpperCase();
        System.out.println(newStr1.substring(0, 8));
    }
}
