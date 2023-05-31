package paran.paranprojectbackend.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import paran.paranprojectbackend.service.PostsService;
import paran.paranprojectbackend.web.dto.PostsResponseDto;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class ClubController {
    private final PostsService postsService;

    @GetMapping("/club")
    public String index(){
        return "ClubList_all";
    }

    @GetMapping("/ClubList_all.mustache")
    public String index1(){
        return "ClubList_all";
    }

    @GetMapping("/ClubList.mustache")
    public String index2(){
        return "ClubList";
    }
    @GetMapping("/posts")
    public String index_1(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "clubpage";
    }

    @GetMapping("/ClubList_art.mustache")
    public String club_art(){
        return "ClubList_art";
    }
    @GetMapping("/ClubList_exercise.mustache")
    public String club_exercise(){
        return "ClubList_exercise";
    }

    @GetMapping("/ClubList_free.mustache")
    public String club_free(){
        return "ClubList_free";
    }

    @GetMapping("/ClubList_mon.mustache")
    public String club_mon(){
        return "ClubList_mon";
    }

    @GetMapping("/ClubList_tue.mustache")
    public String club_tue(){
        return "ClubList_tue";
    }

    @GetMapping("/ClubList_wed.mustache")
    public String club_wed(){
        return "ClubList_wed";
    }

    @GetMapping("/ClubList_thu.mustache")
    public String club_thu(){
        return "ClubList_thu";
    }

    @GetMapping("/ClubList_fri.mustache")
    public String club_fri(){
        return "ClubList_fri";
    }

    @GetMapping("/ClubList_sat.mustache")
    public String club_sat(){
        return "ClubList_sat";
    }

    @GetMapping("/ClubList_sun.mustache")
    public String club_sun(){
        return "ClubList_sun";
    }

    @GetMapping("/ClubList_volunteer.mustache")
    public String club_volunteer(){
        return "ClubList_volunteer";
    }
}
