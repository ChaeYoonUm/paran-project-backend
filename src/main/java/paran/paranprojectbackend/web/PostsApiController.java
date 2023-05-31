package paran.paranprojectbackend.web;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import paran.paranprojectbackend.service.PostsService;
import paran.paranprojectbackend.web.dto.PostsResponseDto;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id){
        return postsService.findById(id);
    }
}
