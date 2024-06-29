package com.meireles.telalogin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
    String usuario = "Victor";
    String senha = "1234";

    @GetMapping("/admin")
    public String adminLogin(){
        return "redirect:login";
    }

    @PostMapping("/admin")
    public String admin(@RequestParam("user") String user, @RequestParam("pwd") String pwd, Model model){
        if(user.equals(usuario) && pwd.equals(senha)){
            model.addAttribute("user", user);
            return "admin";
        }else{
            return "redirect:login";
        }
    }
}
