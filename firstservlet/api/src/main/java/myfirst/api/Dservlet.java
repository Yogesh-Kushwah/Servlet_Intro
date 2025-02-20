package myfirst.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dservlet {

    @GetMapping("/hellow")
    public String ff() {

        return "jay shree ram";

    }

    @GetMapping("/newapi")
    public String aa() {
        return "Dipanshu ";
    }

    @GetMapping("/search")
    public String rr(@RequestParam("q") String ss) {
        if (ss.equals("Hritik"))
            return "good dancer";
        else return "bad dancer";
    }

    @GetMapping("/search2/{a}/{second}")

    public String rrc(@PathVariable int a, @PathVariable("second") int b) {
        return "" + a + b;
    }



}