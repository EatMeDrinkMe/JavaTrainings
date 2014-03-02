package trainings.week1.task;
public class Week1Task1 {
    final private double PI = Math.PI;

    public int getTheLargest(int a, int b, int c){
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println(max);
        return max;
    }

    public double calculate(double a, double b, char operator){
        double res = 0;
        switch(operator){
            case '+':
                res = a+b;
                System.out.println("a + b = "+res);
                break;
            case  '-':
                res = a-b;
                System.out.println("a - b = " + res);
                break;
            case '*':
                res = a*b;
                System.out.println("a * b = "+res);
                break;
            case '/':
                res = a/b;
                System.out.println("a / b = "+ res);
                break;

        }
    return res;
    }

    public static boolean isEquals(double a, double b){
        boolean res = false;

        if (a==b) res = true;

        if (a!=b) res = false;
        System.out.println(res);
        return res;


    }

    public int increment(int a) {
        a=a+1;
        System.out.println("new a = "+a);
        return a;
    }
    public double square(int radius){
        double S;
        S = PI * radius * radius;
        System.out.println("square = "+S);
        return S;
    }

    public boolean isEven(int a){
        boolean x;

        if (a %2 == 0){
            x = true;
            System.out.println("number "+ a + " %2 == 0 ---" + x);
        }
        else {
            x = false;
            System.out.println("number " + a + " %2 != 0 ---"+ x);
        }
        return x;
    }

    public int divideBy2(int a){
        if (a%2 == 0){
        a = a/2;
        System.out.println("a = " +a);
        }
        else System.out.println("division is not performed");
        return a;
    }

    public String sayHello(String someGuy){
        String saidHello = "Hey, "+someGuy+"!";
        System.out.println(saidHello);
        return saidHello;
    }
    public String yearsOld(String name, int currentYear, int yearOfBorn){
        String answer = name +" "+ (currentYear - yearOfBorn) + " years";
        System.out.println(answer);
        return answer;
    }
    public int getIndexOf(String searchString, char symbol){
        int St;
        St = searchString.length();
        int num = searchString.lastIndexOf(symbol);
        System.out.println(num);
        return num;
    }
    public double getPension(int year, double salary){
        double pens = 0;

        if (year < 6){
            pens = salary * 0.7;
            System.out.println("Vasha zarplata "+salary+"*0.9 = "+pens);
        }
        else if (6<year){
            if(year<11){
                pens = salary * 0.8;
                System.out.println("Vasha zarplata "+salary+"*0.9 = "+pens);
            }
            else if (11<year){
                if(year<16){
                    pens = salary * 0.9;
                    System.out.println("Vasha zarplata "+salary+"*0.9 = "+pens);
                }
                else if (15 < year){
                    pens = salary * 0.95;
                    System.out.println("Vasha zarplata "+salary+"*0.95 = "+pens);
                }
            }
        }
        else ;
        return pens;
    }
    public int getTheLargestElement(int[] array){
        int max =array[0];
        int i;
        for (i=0; i< array.length; i++){
        if (array[i++]>max) max = array [i++];
        }
        System.out.println(max);
        return max;
    }
    public int getEvenSum(int[] array){
        int sum=0;
        int i;
        for (i = 0; i < array.length; i ++){
            if (array [i]%2==0){
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
        return sum;
    }
/*    public int [] getNegativeArray(int[] array){
        int i=0;
        int j=0;



            for (i = 0; i < array.length; i++){
                if (array [i]<0){
                array[j]=array[i];
                j++;

            }
                System.out.println(array);

            }
    return array;

    }/*
    public boolean isInArray(String [] array, String searchString){


    return false;
    }*/
}

