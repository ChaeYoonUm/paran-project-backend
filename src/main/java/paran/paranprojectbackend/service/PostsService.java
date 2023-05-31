package paran.paranprojectbackend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import paran.paranprojectbackend.posts.Posts;
import paran.paranprojectbackend.posts.PostsRepository;
import paran.paranprojectbackend.web.dto.PostsListResponseDto;
import paran.paranprojectbackend.web.dto.PostsResponseDto;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService{
    private final PostsRepository postsRepository;

    @Transactional(readOnly = true) //트랜잭션 범위는 유지, 조회 속도 개선 (등록, 수정, 삭제 기능 없는 서비스 메소드에서 사용하는 것 추천)
    public List<PostsListResponseDto> findAllDesc() {
        return postsRepository.findAllDesc().stream()
                .map(PostsListResponseDto::new)
                .collect(Collectors.toList());
    }

    public PostsResponseDto findById (Long id){
        Posts entity = postsRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new PostsResponseDto(entity); // JPA : 영속성 컨텍스트, 영속성 컨텍스트 : 엔티티를 영구 저장하는 환경
    }



}
