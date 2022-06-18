package code.DAY7;

import com.github.javafaker.Faker;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class c2_javaFaker {
    @Test
    public void TC1_javaFaker(){
        Faker  faker=new Faker();
        System.out.println("name : " + faker.name().fullName());
        System.out.println("firstname : "+ faker.name().firstName());
        System.out.println("city name = " + faker.address().cityName());
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.artist().name());
        System.out.println(faker.avatar().image());
        System.out.println(faker.animal().name());
        System.out.println(faker.ancient().god());

    }
}
