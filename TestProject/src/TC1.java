import org.testng.annotations.*;

public class TC1 {
    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before the class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute after the class");
    }
}