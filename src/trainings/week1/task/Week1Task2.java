package trainings.week1.task;

public class Week1Task2 {

   final private int TEN = 10;
   
   public static void main(String[] args){
        Week1Task2 testObject = new Week1Task2();
		System.out.println(testObject.getTheLargest(1,2,5));  
		System.out.println(testObject.getTheLargest(1,2,5));
   }

//1Метод возвращает самое большое из чесил a,b и c
    public int getTheLargest(int a, int b, int c){
        return 3;
    }

//2Метод проверяет равны ли числа a и b
    public boolean isEquals(double a, double b){
        return false;
    }

//3Метод возвращает параметр a, увеличенный на 1
    public int increment(int a){
        return 0;
    }

//4Метод возвращает площадь круга
    public int square(int radius){
        return 0;
    }

//5Метод проверяет четное ли число
    public boolean isEven(int a){
        return false;
    }

//6Метод возвращает результат деления на 2, если число четное
    public int divideBy2(int a){
        return 0;
    }

//7Метод возвращает приветствие типа "Привет, Вася!"
    public String sayHello(String someGuy){
        return null;
    }

//8Метод возвращает фразу типа "Маше 20 лет"
    public String yearsOld(String name, int currentYear, int yearOfBorn){
        return null;
    }

//9Метод возвращает индекс символа в строке поиска
    public int getIndexOf(String searchString, char symbol){
        return 0;
    }

//10Метод считает пенсию в зависимости от лет стажа и средней зарплаты
//формула расчета: пенсия = коэф * зарплата
//если стажа до 5 лет, то коэф = 0,7;
//           от 6 до 10, коэф = 0,8;
//           от 11 до 15, коэф = 0,9;
//           от 15,       коэф = 0,95.
    public double getPension(int year, double salary){
        return 0;
    }

//11Метод проводит операции над a и b. Возможные значения параметра operator: + - / *
    public double calculate(int a, int b, char operator){
        return 0;
    }

//В следующих методах использовать разные виды циклов

//12Метод возвращает самый большой элемент массива
    public int getTheLargestElement(int[] array){
        return 0;
    }

//13Метод возвращает сумму четных элементов массива
    public int getEvenSum(int[] array){
        return 0;
    }

//14Метод возвращает массив, содержащий только отрицательные элементы данного массива
    public int[] getNegativeArray(int[] array){
        return null;
    }

//15Метод проверяет есть ли среди элементов массива заданная строка
    public boolean isInArray(String [] array, String searchString){
        return false;
    }

}
