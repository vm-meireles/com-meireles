package com.meireles.telalogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SairController {
    @GetMapping("/sair")
    public String sair(){
        return "redirect:login";
    }
}
