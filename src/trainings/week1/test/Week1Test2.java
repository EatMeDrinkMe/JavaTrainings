package trainings.week1.test;

import junit.framework.Assert;
import org.junit.Test;
import trainings.week1.task.Week1Task1;

public class Week1Test2 {

    final private double PI = Math.PI;

    private Week1Task1 task = new Week1Task1();

    @Test
    public void isTheLargest(){
        Assert.assertEquals(3, task.getTheLargest(1, 2, 3));
    }
  //  I changed the the answer in the test, was a mistake in Assert.assertEquals(true , task.isEquals(3, 3)) -- fixed it
    @Test
    public  void isEquals(){
        Assert.assertEquals(true, task.isEquals(3, 3));

    }

   @Test
    public void increment(){
        Assert.assertEquals(3, task.increment(2));
    }

//mistake in answer, I fixed answer, it was 4, and I had change it, to 4/Pi
    @Test
    public void square(){
        Assert.assertEquals(4*PI, task.square(2));
    }

//was a mistake in Assert.assertEquals(true , task.isEquals(3, 3)) -- fixed it
    @Test
    public void isEven(){
        Assert.assertEquals(true,task.isEven(20));
    }

    @Test
    public void divideBy2(){
        Assert.assertEquals(8, task.divideBy2(16));
    }


    @Test
    public void saidHello(){
        Assert.assertEquals("Hey, Igor!", task.sayHello("Igor"));
    }


    @Test
    public void yearsOld(){
        Assert.assertEquals("Katya 24 years", task.yearsOld("Katya", 2014, 1990));
    }


    @Test
    public void indexOf(){
        Assert.assertEquals(2, task.getIndexOf("School", 'h'));
    }

    @Test
    public void getPension(){
        Assert.assertEquals(4500.0, task.getPension(12, 5000));
    }

// change "res": I changed the the answer in the test with the "3" to "3.0" to check, because a and b are shown as double
       @Test
       public void calculate(){
       Assert.assertEquals(3.0, task.calculate(12, 4, '/'));
       }


    @Test
    public void getLargestElement(){
        Assert.assertEquals(20, task.getTheLargestElement(new int[] {5, 10, 12, 20}));
    }


    @Test
    public void getEvenSum(){
        Assert.assertEquals(42, task.getEvenSum(new int[] {5, 10, 12, 20}));
    }
/*
    @Test
    public void getNegativeArray(){
        Assert.assertEquals(new int[] {-5, -12}, task.getNegativeArray(new int[]{-5, 10, -12, 20}));
    }

    @Test
    public void isInArray(){
        Assert.assertTrue(task.isInArray(new String[] {"first", "second", "third"}, "first"));
    }
*/
}
