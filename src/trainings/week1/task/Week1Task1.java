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
        return max;
    }

    public double calculate(double a, double b, char operator){
        double res = 0;
        switch(operator){
            case '+':
                res = a+b;
                break;
            case  '-':
                res = a-b;
                break;
            case '*':
                res = a*b;
                break;
            case '/':
                if(b == 0){
                    System.out.println("Dividing by zero error!");
                    return -1;
                }
                res = a/b;
                break;
        }
        return res;
    }

    public static boolean isEquals(double a, double b){
        return a == b;
    }

    public int increment(int a) {
        return ++a;
    }

    public double square(int radius){
        return PI * radius * radius;
    }

    public boolean isEven(int a){
        return a %2 == 0;
    }

    public int divideBy2(int a){
        return a/2;
    }

    public String sayHello(String someGuy){
        return "Hey, "+someGuy+"!";
    }

    public String yearsOld(String name, int currentYear, int yearOfBorn){
        return name +" "+ (currentYear - yearOfBorn) + " years";
    }

    public int getIndexOf(String searchString, char symbol){
        return searchString.indexOf(symbol);
    }

    public double getPension(int year, double salary){
        double pension = 0;

        if (year < 6){
            pension = salary * 0.7;
        } else if ( 6 <= year && year < 11){
            pension = salary * 0.8;
        } else if (11 <= year && year < 16){
            pension = salary * 0.9;
        } else {
            pension = salary * 0.95;
        }

        return pension;
    }

    public int getTheLargestElement(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int getEvenSum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                sum = sum + array[i];
            }
        }
        return sum;
    }

    public int [] getNegativeArray(int[] array){
        int negativeCount = 0;

        for(int element: array){
            if(element < 0) negativeCount++;
        }

        int[] resultArray = new int[negativeCount];
        for(int i = 0, j = 0; i < array.length; i++){
            if(array[i] < 0){
                resultArray[j] = array[i];
                j++;
            }
        }

        return resultArray;
    }


    public boolean isInArray(String [] array, String searchString){
        for(String element: array){
            if(element.equals(searchString)){
                return true;
            }
        }
        return false;
    }
}

