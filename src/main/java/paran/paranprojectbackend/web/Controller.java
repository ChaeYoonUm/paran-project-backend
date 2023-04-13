package paran.paranprojectbackend.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("동아리")
    public String hello() {
        return "동아리";
    }
}
