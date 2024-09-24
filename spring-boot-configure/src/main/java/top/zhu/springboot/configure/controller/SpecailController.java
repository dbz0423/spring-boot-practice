package top.zhu.springboot.configure.config;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhu.springboot.configure.entity.Special;
import top.zhu.springboot.configure.mapper.SpecialMapper;

import java.util.List;

@RestController
public class SpecailController {
    @Resource
    private SpecialMapper specialMapper;

    @GetMapping("/specials")
    public List<Special> getSpecials() {
        return specialMapper.findAll();
    }
}
