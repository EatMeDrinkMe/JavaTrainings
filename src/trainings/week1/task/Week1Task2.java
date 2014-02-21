

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.pow;


public class Week1Task2
{

    public int getTheLargest()
    {
        int a;
        int b;
        int c;
        int max=0;
        System.out.println("Vvedite chiclo A dlia proverki ");
        Scanner ina = new Scanner(System.in);
        a = ina.nextInt();
        System.out.println("Vvedite chiclo B dlia proverki ");
        Scanner inb = new Scanner(System.in);
        b = inb.nextInt();
        System.out.println("Vvedite chiclo C dlia proverki ");
        Scanner inc = new Scanner(System.in);
        c = inb.nextInt();

        if (a>max) max = a;
        if (b>max) max = b;
        if (c>max) max = c;
        System.out.println("metod getTheLargest--Otvet 4islo = "+ max);
       return max;
    }

    public boolean isEquals( )

    {
        int a,b;
        boolean x;
        System.out.println("Vvedite chiclo A dlia proverki ");
        Scanner ina = new Scanner(System.in);
        a = ina.nextInt();
        System.out.println("Vvedite chiclo B dlia proverki ");
        Scanner inb = new Scanner(System.in);
        b = inb.nextInt();
        System.out.println("dlia isEquals");
        System.out.println("dlia a = "+a+" u b = "+ b+" proverca daet otvet = "+ (a==b));
        System.out.println("dopolnitelnaia proverka");
        if (a==b) System.out.println("a = "+a+ " b = " +b + " rezult - 4isla ravnu");
        if (a!=b) System.out.println("a = "+a+ " b = " +b + " rezult - 4isla neravnu");

        return false;
    }

   public int increment()
    {
       int a;
        System.out.println("Vvedite chiclo A dlia proverki ");
        Scanner ina = new Scanner(System.in);
        a = ina.nextInt();


       System.out.println("dlia increment");
       System.out.println("Vu ykazali a = " + a);
       a=a+1;
       System.out.println("Teper a= " + a);
       return a;
    }

    public double square()

    {

        double S,radius,y=2;
        System.out.println("Vvedite radius dlia proverki R = ");
        Scanner inRadius = new Scanner(System.in);
        radius = inRadius.nextInt();


        S = Math.PI * pow(radius, y);
        System.out.println("Plowad = "+S);
        return 0;
    }

    public boolean isEven()
    {
        double t;
        boolean x;
        System.out.println("Ykazhute 4islo dlia proverki --- ");
        Scanner inT = new Scanner(System.in);
        t = inT.nextInt();
        if (t %2 == 0)
        {
            x = true;
            System.out.println("chislo "+ t + " chetnoe ---" + x);
        }
        else {
            x = false;

        System.out.println("chislo " + t + " nechrtnoe---"+ x);
            }

        return false;
    }

    public int divideBy2()

    {
        double r;
        double rez;
        System.out.println("Ykazhute 4islo dlia proverki delenia na 2 --- ");
        Scanner inR = new Scanner(System.in);
        r = inR.nextInt();
        if (r%2 ==0) {
            System.out.println("chislo "+ r + " chetnoe");
            rez = r/2;
        System.out.println("Rez = " +rez);
        }
        else System.out.println("chislo " + r + " nechrtnoe - delenie ne provoditsia");

        return 0;
    }

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
*/




    public static void main(String[] args) throws IOException {
        int choise;
        do
        {
            System.out.println("Vibirite kakoi metod vipolnit -----");
            System.out.println("getTheLargest---------------- ----1");
            System.out.println("isEquals--------------------- ----2");
            System.out.println("increment-------------------- ----3");
            System.out.println("square----------------------- ----4");
            System.out.println("isEven----------------------- ----5");
            System.out.println("divideBy2 ------------------- ----6");
            System.out.println("sayHello -------------------- ----7");
            System.out.println("yearsOld -------------------- ----8");
            System.out.println("getIndexOft------------------ ----9");
            System.out.println("getPension ------------------- ---10");
            System.out.println("calculate--------------------- ---11");
            System.out.println("Vibirite kakoi metod vipolnit ---12");
            System.out.println("Vibirite kakoi metod vipolnit ---13");
            System.out.println("Vibirite kakoi metod vipolnit ---14");
            System.out.println("Vibirite kakoi metod vipolnit ---15");
            Scanner cH = new Scanner(System.in);
            choise = cH.nextInt();
        }
        while (choise < 1||choise>15);
        System.out.println("\n");

        switch (choise)
        {
            case 1:
      Week1Task2 getTheL = new Week1Task2();
      getTheL.getTheLargest();
            break;
            case 2:
      Week1Task2 isEq = new Week1Task2();
      isEq.isEquals();
            break;
            case 3:
      Week1Task2 inCrem = new Week1Task2();
      inCrem.increment();
                break;
            case 4:
      Week1Task2 pLo = new Week1Task2();
      pLo.square();
                break;
            case 5:
      Week1Task2 isEv = new Week1Task2();
      isEv.isEven();
                break;
            case 6:
      Week1Task2 div2 = new Week1Task2();
      div2.divideBy2();
                break;
            case 7:
      Week1Task2 sayH = new Week1Task2();
      sayH.sayHello();
                break;
            case 8:
      Week1Task2 yearsO = new Week1Task2();
      yearsO.yearsOld();
                break;
            case 9:
      Week1Task2 getIndex = new Week1Task2();
      getIndex.getIndexOf();
                break;
            case 10:
      Week1Task2 getPen = new Week1Task2();
      getPen.getPension();
                break;
            case 11:
      Week1Task2 calc = new Week1Task2();
      calc.calculate();
                break;
           /* case 12:
      Week1Task2 getTheLE = new Week1Task2();
      getTheLE.getTheLargestElement();
                break;
            case 13:
      Week1Task2 getES = new Week1Task2();
      getES.getEvenSum();
                break;
            case 14:
      Week1Task2 getNeg = new Week1Task2();
      getNeg.getNegativeArray();
                break;
            case 15:
      Week1Task2 isIn = new Week1Task2();
      isIn.isInArray();
                break;*/
        }


        }

    }





