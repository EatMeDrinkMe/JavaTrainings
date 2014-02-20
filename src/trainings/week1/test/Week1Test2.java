package trainings.week1.test;

import junit.framework.Assert;
import org.junit.Test;
import trainings.week1.task.Week1Task2;

public class Week1Test2 {

    final private double PI = Math.PI;

    private Week1Task2 task = new Week1Task2();

    @Test(enabled=true)
    public void isTheLargest(){
        Assert.assertEquals(3, task.getTheLargest(1, 2, 3));
    }

    @Test(enabled=false)
    public void isEquals(){
        Assert.assertTrue(task.isEquals(2, 2));
    }

    @Test(enabled=false)
    public void increment(){
        Assert.assertEquals(3, task.increment(2));
    }

    @Test(enabled=false)
    public void square(){
        Assert.assertEquals(4, task.square(2));
    }

    @Test(enabled=false)
    public void isEven(){
        Assert.assertTrue(task.isEven(20));
    }

    @Test(enabled=false)
    public void divideBy2(){
        Assert.assertEquals(8, task.divideBy2(16));
    }

    @Test(enabled=false)
    public void saidHello(){
        Assert.assertEquals("Hey, Igor!", task.sayHello("Igor"));
    }

    @Test(enabled=false)
    public void yearsOld(){
        Assert.assertEquals("Katya 24 years", task.yearsOld("Katya", 2014, 1990));
    }

    @Test(enabled=false)
    public void indexOf(){
        Assert.assertEquals(2, task.getIndexOf("School", 'h'));
    }

    @Test(enabled=false)
    public void getPension(){
        Assert.assertEquals(4500, task.getPension(12, 5000));
    }

    @Test(enabled=false)
    public void calculate(){
        Assert.assertEquals(3, task.calculate(12, 4, '/'));
    }

    @Test(enabled=false)
    public void getLargestElement(){
        Assert.assertEquals(20, task.getTheLargestElement(new int[] {5, 10, 12, 20}));
    }

    @Test(enabled=false)
    public void getEvenSum(){
        Assert.assertEquals(42, task.getEvenSum(new int[] {5, 10, 12, 20}));
    }

    @Test(enabled=false)
    public void getNegativeArray(){
        Assert.assertEquals(new int[] {-5, -12}, task.getNegativeArray(new int[]{-5, 10, -12, 20}));
    }

    @Test(enabled=false)
    public void isInArray(){
        Assert.assertTrue(task.isInArray(new String[] {"first", "second", "third"}, "first"));
    }

}