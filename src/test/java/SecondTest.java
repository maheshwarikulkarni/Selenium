import org.testng.annotations.Test;

public class SecondTest {
    @Test(testName = "mobiletest" )
    public void mobiletest(){
        System.out.println("First mobiletest");
    }
    @Test(testName ="mobileandroid")
    public void mobileandroid(){
        System.out.println("This is Andriod mobile test");
    }
    @Test(testName = "mobileios")
    public void mobileios(){
        System.out.println("This is IOS mobile test");
    }
}
