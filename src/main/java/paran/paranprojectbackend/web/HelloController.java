package paran.paranprojectbackend.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Controller
public class HelloController {
    @GetMapping("/club")
    public String index(){
        return "clublist";
    }
}
