package cn.devlab.todo.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhonlian on 2016/7/18.
 */

@RestController
public class Example {

    @RequestMapping("/example")
    String example(){
        return "example";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}
