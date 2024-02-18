import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FirstTest {
    @Test
    public void test1(){
       // WebDriver driver=new ChromeDriver();
        //System.setProperty();
        ArrayList<String> list=new ArrayList();
        list.add("selenium");
        list.add("Postman");
        list.add("Cypress");
        list.add("Jenkins");
        list.stream().filter(s->s.length()>4).forEach(s->System.out.println(s.toLowerCase()));
        //System.out.println(one);
         list.stream().filter(s->s.length()>4).limit(3).forEach(s->System.out.println(s));
        //System.out.println(list.isEmpty());

    }
    @Test(testName = "test1" ,priority = '2')
    public void SteramMap(){
        Stream.of("Jenkins","Docker","Selenium","Cypress","APIAutomation","Jmeter").filter(s->s.endsWith("m")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    }
    @Test(priority = '3')
    public void Flatmap(){
        ArrayList<String>list=new ArrayList<>();
        list.add("Selenium");
        list.add("RestAPI");
        list.add("Cypress");
        list.add("Jenkins");
        //list.stream().filter(s->s.toLowerCase()
    }
}
