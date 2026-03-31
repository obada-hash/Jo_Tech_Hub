package berserk.jo_tech_hub.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "posts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String author;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PostStatus status;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

//    @OneToMany(mappedBy = "post")
//    private List<Ticket> tickets;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
