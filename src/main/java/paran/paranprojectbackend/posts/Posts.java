package paran.paranprojectbackend.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "club")
@Getter
@NoArgsConstructor
@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String club_name;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String club_intro;

    private String club_type;

    @Builder
    public Posts(String club_name, String club_type, String club_intro){
        this.club_name=club_name;
        this.club_type=club_type;
        this.club_intro=club_intro;
    }
}
