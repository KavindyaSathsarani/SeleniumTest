import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
    @Test
    void startCar() {
        System.out.println("Car started");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("Car drove");
    }
}