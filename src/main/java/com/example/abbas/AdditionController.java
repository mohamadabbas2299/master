package com.example.abbas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdditionController {

    @GetMapping("/add")
    public String showAddForm() {
        return "add";
    }

    @PostMapping("/add")
    public String performAddition(@RequestParam int num1, @RequestParam int num2, Model model) {
        int result = num1 + num2;
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        return "result";
    }
}
