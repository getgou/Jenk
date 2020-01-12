package bamboo2.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public String helloBamboo(){
        return "Hello from bamboo!!";
    }
}
