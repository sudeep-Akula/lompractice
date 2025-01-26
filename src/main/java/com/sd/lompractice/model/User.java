package com.sd.lompractice.model;



import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;


@Entity
@Table(name = "user1")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class User {

   @Id
   @GeneratedValue(generator = "userSeq" , strategy = GenerationType.AUTO)
           @SequenceGenerator(name = "userSeq", sequenceName = "userSeq")
   int id;
   String name;
   String mobile;
   String email;
   String password;
}
