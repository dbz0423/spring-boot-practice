package top.zhu.springboot.quickstart.service;

import org.springframework.stereotype.Service;
import top.zhu.springboot.quickstart.enetity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final List<User> users = List.of(
            new User(1L,"张三",22),
            new User(2L,"张三丰",17),
            new User(3L,"张三疯",19),
            new User(4L,"张三风",16),
            new User(5L,"张三峰",258)
    );

    public List<String> getAdultUserNames() {
        return users.stream()
                // 过滤年龄大于18岁的用户
                .filter(user -> user.getAge() >18)
                // 提取名字
                .map(User::getName)
                .collect(Collectors.toList());
    }
}
