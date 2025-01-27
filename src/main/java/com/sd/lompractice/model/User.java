package com.sd.lompractice.model;



import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;


@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class User {

   @Id
   @GeneratedValue
   int id;
   String name;
   String mobile;
   String email;
   String password;
}
