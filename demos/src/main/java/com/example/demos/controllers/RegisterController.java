package com.example.demos.controllers;



import com.example.demos.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller

public class RegisterController {
    @Autowired
    private com.example.demos.repo.UserRepository userRepository;

    String log,psw, fi, no, ad;
    String loginsign,passsingn;



    Iterable<User> users;

    @GetMapping("/reg")
    public String Reg(Model model, Model model1,Model model2) {
        model1.addAttribute("lg",log);
        model2.addAttribute("ps",psw);
        return "reg";

    }
    @PostMapping("/reg")
    public String regadd(@RequestParam String login, @RequestParam String pass, @RequestParam String fio, @RequestParam String nomer,@RequestParam String adress){
        log = login;
        psw = pass;
        fi = fio;
        no = nomer;
        ad = adress;
        System.out.println(log);
        return  "redirect:/rc";
    }

    @GetMapping("/rc")
    public String Rc(Model model, Model model1,Model model2) {
        users = userRepository.findAll();
        model2.addAttribute("users",users);
        model1.addAttribute("lg",log);
        model.addAttribute("ps",psw);
        return "rc";
    }
    @PostMapping("/rc")
    public String rcadd(@RequestParam String login, @RequestParam String pass, @RequestParam String fio, @RequestParam String nomer,@RequestParam String adress){
        log = login;
        User user = new User(login,pass,fio,nomer,adress);
        userRepository.save(user);
        return  "redirect:/rec";
    }
    @GetMapping("/rcs")
    public String Rcs(Model model) {
        User user = new User(log,psw,fi,no,ad);
        userRepository.save(user);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String log(Model model) {

        return "login";

    }
    @PostMapping("/login")
    public String logadd(@RequestParam String loginv, @RequestParam String passv){
        loginsign = loginv;
        passsingn = passv;
        return  "redirect:/lg";
    }

    @GetMapping("/lg")
    public String lgg(Model model, Model model1,Model model2) {
        users = userRepository.findAll();
        model2.addAttribute("users",users);
        model1.addAttribute("lg",loginsign);
        model.addAttribute("ps",passsingn);
        return "lg";
    }
    @PostMapping("/lg")
    public String lgadd(){
        return  "redirect:/indexu";
    }

    @GetMapping("/profile")
    public String profile(Model model, Model model1) {
        users = userRepository.findAll();
        model1.addAttribute("users",users);
        model.addAttribute("lg", loginsign);
        System.out.println("pro");
        return "profile";
    }


    @PostMapping("/profile/{id}")
    public String pre(@PathVariable(value = "id") long id,@RequestParam String login, @RequestParam String pass, @RequestParam String fio, @RequestParam String nomer,@RequestParam String adress){
        User user = userRepository.findById(id).orElseThrow();
        user.setLogin(login);
        user.setPass(pass);
        user.setFio(fio);
        user.setNomer(nomer);
        user.setAdress(adress);
        userRepository.save(user);
        return "redirect:/profile";
    }

    @GetMapping("/profile/{id}")
    public String indexEdit(@PathVariable(value = "id") long id, Model model) {
        if(!userRepository.existsById(id)){
            return  "redirect:/profile/{id}";
        }
        Optional<User> user =  userRepository.findById(id);
        ArrayList<User> res = new ArrayList<>();
        user.ifPresent(res::add);
        model.addAttribute("user",res);
        return "profile-edit";
    }





}
