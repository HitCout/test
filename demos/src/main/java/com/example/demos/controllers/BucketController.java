package com.example.demos.controllers;


import com.example.demos.models.Bucket;
import com.example.demos.models.Product;
import com.example.demos.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller

public class BucketController {
    @Autowired
    private com.example.demos.repo.BucketRepository bucketRepository;

    Iterable<Bucket> bucket;

    String lg,ad,na,su,root;

    @GetMapping("/profilea")
    public String profilea(Model model) {
        bucket = bucketRepository.findAll();
        model.addAttribute("bu",bucket);
        if(root!=null) {
            if (root.equals("admin")) {
                System.out.println("ab");
                return "profilea";
            }
        }
        System.out.println("rtaaaa");
        return "redirect:/index";
    }

    @PostMapping("/profilea")
    public String profileaз(Model model, @RequestParam String rta) {
        bucket = bucketRepository.findAll();
        model.addAttribute("bu",bucket);
       root = rta;
        System.out.println("rta"+rta);
        return "/profilea";
    }

    @GetMapping("/buy")
    public String profileb(Model model) {
        return "buy";
    }

    @PostMapping("/buy")
    public String profilebз(Model model) {

        return "buy";
    }


    @PostMapping("/bt")
    public String rtp(@RequestParam String loginb,@RequestParam String adress,@RequestParam String names,@RequestParam String sum){
        lg = loginb;
        ad = adress;
        na = names;
        su = sum;
        Bucket bucket = new Bucket(loginb,adress,names,sum);
        bucketRepository.save(bucket);
        return "redirect:/index";
    }
}
