package top.zhu.springboot.thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserData {
    private Long id;
    private String name;
    private String email;
}
