package paran.paranprojectbackend.web.dto;

import paran.paranprojectbackend.posts.Posts;

public class PostsListResponseDto {
    private Long id;
    private String club_name;
    private String club_type;
    private String club_intro;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.club_name = entity.getClub_name();
        this.club_type = entity.getClub_type();
        this.club_intro= entity.getClub_intro();

    }
}
