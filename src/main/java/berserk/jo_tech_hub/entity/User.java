package berserk.jo_tech_hub.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    private String phoneNumber;
    private String password;

    @ManyToOne
    private Ticket ticket;

//    @OneToMany(mappedBy = "post")
//    private List<Ticket> tickets;

    // organizers with posts

}
