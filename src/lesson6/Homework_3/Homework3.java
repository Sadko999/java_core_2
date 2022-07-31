package lesson6.Homework_3;

import java.io.*;

public class Homework3 {
    public static void main(String[] args) throws IOException {
        //--------------------------------- Задача №1-----------------------------------------------
        Zhiguli vaz2101 = new Zhiguli();
        Toyota landCruiser = new Toyota();

        vaz2101.start();
        vaz2101.malfunction();

        landCruiser.stop();
        landCruiser.music();
        //----------------------------------Задача №2-----------------------------------------------------
        String fileName = "D:\\repos\\java_core_2\\src\\lesson6\\Homework_3\\my_first_file.txt";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        String line2 = bufferedReader.readLine();

        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(line + " " + line2);
        fileWriter.close();
    //---------------------------------------------Задача №3---------------------------------------------
        Financial_record financial_record1 = new Financial_record(500, 300);
        FileWriter fileWriter1 = new FileWriter("D:\\repos\\java_core_2\\src\\lesson6\\Homework_3\\report.txt");
        fileWriter1.write("Доходы = " + financial_record1.getIncomes() +  ", " + "расходы = " + financial_record1.getOutcomes());
        fileWriter1.close();
    }

}


