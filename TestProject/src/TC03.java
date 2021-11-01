
import org.testng.annotations.Test;
public class TC03 {

           @Test(priority = 1)
        void setup(){
            System.out.println("opening browser");
        }
        @Test(priority = 2)
        void SearchCustomer(){
            System.out.println("this is search");
        }

    }


