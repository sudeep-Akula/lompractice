package com.sd.lompractice.dto;

import lombok.*;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

   private String name;
    private  String mobile;
    private String email;
    private String password;

//    public UserDto(String name, String mobile, String email, String password) {
//        this.name = name;
//        this.mobile = mobile;
//        this.email = email;
//        this.password = password;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getMobile() {
//        return mobile;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String toString() {
//        return "UserDto{" +
//                "name='" + name + '\'' +
//                ", mobile='" + mobile + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}
