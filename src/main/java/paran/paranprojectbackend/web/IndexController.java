package paran.paranprojectbackend.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import paran.service.PostsService;
//import paran.web.dto.PostsResponseDto;

@RequiredArgsConstructor
@Controller
public class IndexController {

    //private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model){ //Model : postsService.findAllDesc()로 가져온 결과를 posts로 index.mustache에 전달
        //model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        //PostsResponseDto dto = postsService.findById(id);
        //model.addAttribute("post", dto);

        return "posts-update";
    }
}