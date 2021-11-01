
import org.testng.annotations.Test;
public class TC03 {

           @Test(priority = 1)
        void setup(){
            System.out.println("opening browser");
        }
        @Test(priority = 3)
        void SearchCustomer(){
            System.out.println("this is search");
        }
        @Test(priority = 2)
        void AddCustomer(){
            System.out.println("Add Customer");
        }
        @Test(priority = 4)
        void teardown(){
            System.out.println("closing browser");
        }
    }


