/*package trainings.week1.task;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.pow;


public class Week1Task2
{



         public String sayHello()
         {
             String someGuy;

        String proverka = "Vasia";

        System.out.println("Ykazhite Vashe inia ---");
             Scanner sG = new Scanner(System.in);
             someGuy = sG.nextLine();
        if (someGuy.equals(proverka))
        System.out.println("PRIVET "+someGuy +"!!!");
        else System.out.println("Imia ne naideno");
        return null;
    }

    public String yearsOld()
    {
        String name;
        int currentYear;
        int yearOfBorn;

        String proverka = "Masha";

        System.out.println("Ykazhite vashe imia - ");
        Scanner nM = new Scanner(System.in);
        name = nM.nextLine();

        if (name.equals(proverka))
        {
        System.out.println("Ykazhite god vashego rozhdenia --");
        Scanner god = new Scanner(System.in);
        yearOfBorn = god.nextInt();
        currentYear = 2014 - yearOfBorn;
        System.out.println(name +" Vam " + currentYear + "let");
        }
        else System.out.println("Imia ne naideno");

        return null;
    }


    public int getIndexOf() throws IOException {
        String searchString;
        String symbol;

        System.out.println(" Vvedite predlozhenie dlia poiska");
        Scanner preD = new Scanner(System.in);
        searchString = preD.nextLine();
        System.out.println("Ykazhute bukvy dlia poska");
        Scanner bekV = new Scanner(System.in);
        symbol = bekV.nextLine();
        int St;
        St = searchString.length();
        int num = searchString.lastIndexOf(symbol);
        int numR = num+1;
        System.out.println("V stroke -"+St+" Simvolov " + " index sovpadenia -" +numR);

        return 0;
    }

    //10Метод считает пенсию в зависимости от лет стажа и средней зарплаты
//формула расчета: пенсия = коэф * зарплата
//если стажа до 5 лет, то коэф = 0,7;
//           от 6 до 10, коэф = 0,8;
//           от 11 до 15, коэф = 0,9;
//           от 15,       коэф = 0,95.
    public double getPension()
    {
        int year;
        double salary;
        double pension;
        System.out.println("Ykazhite razmer zarplatu - ");
        Scanner saL = new Scanner(System.in);
        salary = saL.nextDouble();
        System.out.print("Ykazhite vash stazh - ");
        Scanner yEAR = new Scanner(System.in);
        year = yEAR.nextInt();
        System.out.println(year);




        if (year < 6)
        {
            pension = salary * 0.7;
            System.out.println("Vasha zarplata "+salary+"*0.7 = "+pension);
        }
        else if (6<year)
        {
            if(year<11)
        {
            pension = salary * 0.8;
            System.out.println("Vasha zarplata "+salary+"*0.8 = "+pension);
        }

        else if (11<year)
        {
            if(year<16)
        {
            pension = salary * 0.9;
            System.out.println("Vasha zarplata "+salary+"*0.9 = "+pension);
        }
        else if (15 < year)
        {
            pension = salary * 0.95;
            System.out.println("Vasha zarplata "+salary+"*0.95 = "+pension);
        }
        }
        }
        else ;


        return 0;
    }

   //11Метод проводит операции над a и b. Возможные значения параметра operator: + - / *
    public double calculate()
    {
        double a;
        double b;
        String operator;




        System.out.println("Ykazhite znachenie a = ");
        Scanner inA = new Scanner(System.in);
        a = inA.nextInt();
        System.out.println("Ykazhite znachenie b = ");
        Scanner inB = new Scanner(System.in);
        b = inB.nextInt();
        double rez;
        System.out.println("Ykazhite tip operacii 4to zhelaete vupolnit s a i b --");
        Scanner oP = new Scanner(System.in);
        operator = oP.nextLine();

        if (operator.equals("+"))
        {
          rez = a+b;
          System.out.println("rezultat " + a+ " + "+b+"raven " +rez);
        }
        if (operator.equals("-"))
        {
            rez = a-b;
            System.out.println("rezultat " + a + " - " + b + "raven " + rez);
        }
        if (operator.equals("-"))
        {
            rez = a/b;
            System.out.println("rezultat " + a+ " / "+b+"raven " +rez);
        }
        if (operator.equals("-"))
        {
            rez = a*b;
            System.out.println("rezultat " + a+ " * "+b+"raven " +rez);
        }

        return 0;
    }
//В следующих методах использовать разные виды циклов
/*
    //12Метод возвращает самый большой элемент массива
    public int getTheLargestElement()
    {
        int[] array;
        System.out.println("Ykazhite elementu massiva --");

        return 0;
    }

    //13Метод возвращает сумму четных элементов массива
    public int getEvenSum()
    {
        int[] array;
        double sum;

        return 0;
    }

    //14Метод возвращает массив, содержащий только отрицательные элементы данного массива
    public int[] getNegativeArray()
    {
        int[] array;
        int [] minArray;



        return null;
    }

    //15Метод проверяет есть ли среди элементов массива заданная строка
    public boolean isInArray(String [] array, String searchString)
    {
        return false;
    }
*


*/


