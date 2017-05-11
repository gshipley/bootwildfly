package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly" + " USERNAME : "+System.getenv("MYSQL_USER") +"  URL : "+ System.getenv("MYSQL_DB_URL"));
    }
}
