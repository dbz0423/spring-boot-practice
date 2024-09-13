package top.zhu.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.zhu.springboot.thymeleaf.model.UserData;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserListController {
    private List<UserData> users = new ArrayList<>();

    @GetMapping("/userList")
    public String userList(Model model) {
        model.addAttribute("users", users);
        return "userList";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestParam String name, @RequestParam String email) {
        Long id = (long)(users.size() + 1);
        UserData userData = new UserData(id, name, email);
        users.add(userData);
        return "redirect:/userList";
    }
}
