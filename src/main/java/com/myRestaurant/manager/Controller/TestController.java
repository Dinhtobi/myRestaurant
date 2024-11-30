package com.myRestaurant.manager.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class TestController {

    @GetMapping
    public String doDisplay(){
        return "helloworld";
    }
    @PostMapping("/submit")
    @ResponseBody
    public Map<String, String> handleFormSubmission(
            @RequestParam("name") String name,
            @RequestParam("email") String email) {

        // Xử lý logic (lưu dữ liệu vào DB hoặc thực hiện nghiệp vụ)
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);

        // Tạo phản hồi JSON
        Map<String, String> response = new HashMap<>();
        response.put("message", "Form submitted successfully!");
        response.put("name", name);
        response.put("email", email);

        return response;
    }
}
