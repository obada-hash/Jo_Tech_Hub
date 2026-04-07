package berserk.jo_tech_hub.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@Entity(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String bio;

    @ManyToOne
    private Post post;

    @ManyToOne
    private User user;



}
