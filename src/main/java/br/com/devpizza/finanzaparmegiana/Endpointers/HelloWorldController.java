package br.com.devpizza.finanzaparmegiana.Endpointers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloWorldController {

    @RequestMapping(path = "/hello")
    public String helloWorld(){
        return "Hello World";
    }

}
