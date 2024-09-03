package top.zhu.springboot.quickstart.service;

import org.springframework.stereotype.Service;
import top.zhu.springboot.quickstart.enums.RequestType;

@Service
public class CustomerService {
    public String handleRequest(RequestType requestType) {
        return switch (requestType) {
            case QUERY -> handleQuery();
            case COMPLAINT -> handleComplaint();
            case SUGGESTION -> handleSuggestion();
        };
    }

    private String handleQuery() {
        return "Handing user query...";
    }

    private String handleComplaint() {
        return "Handing user complaint...";
    }

    private String handleSuggestion() {
        return "Handing user suggestion...";
    }
}
