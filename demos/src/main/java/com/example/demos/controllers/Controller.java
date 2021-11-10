package com.example.demos.controllers;


import com.example.demos.models.Product;
import com.example.demos.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private ProductRepository productRepository;
    Iterable<Product> products;
    public String str,root,lg;

    @GetMapping("/")
    public String ind(Model model) {
        model.addAttribute("title","");
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("title","");
        if(root!=null) {
            if (root.equals("user")) {
                System.out.println("u");
                return "indexu";
            }
            if (root.equals("admin")) {
                System.out.println("a");
                return "indexa";
            }
        }
        return "index";
    }

    @PostMapping("/index")
    public String ip(@RequestParam(name="st") String Str, @RequestParam(name="loginv", required = false, defaultValue = "") String login){
        lg = login;
        str = Str;
        System.out.println("log"+lg);
        return "redirect:/catalog";
    }

    @GetMapping("/bucket")
    public String bucket(Model model,Model model1) {
        model.addAttribute("products",products);
        model1.addAttribute("lg",lg);
        return "bucket";
    }

    @GetMapping("/buy-add")
    public String bucketb(Model model) {
        model.addAttribute("products",products);
        return "bucket";
    }

    @GetMapping("/ex")
    public String ex(Model model) {
        root = null;
        return "redirect:/index";
    }


    @PostMapping("/rt")
    public String rtp(@RequestParam(name="rt") String rt){
        root = rt;
        return "redirect:/index";
    }


    @GetMapping("/about")
    public String faqsa(Model model) {
        model.addAttribute("title", "About");
        if(root!=null) {
            if (root.equals("user")) {
                System.out.println("u");
                return "aboutu";
            }
            if (root.equals("admin")) {
                System.out.println("a");
                return "abouta";
            }
        }
        return "about";
    }



    @GetMapping("/catalog")
    public String cart1(Model model,Model model1) {
        products = productRepository.findAll();
        model.addAttribute("products",products);
        model1.addAttribute("find",str);
        if(root!=null) {
            if (root.equals("user")) {
                System.out.println("u");
                return "catalogu";
            }
            if (root.equals("admin")) {
                System.out.println("a");
                return "cataloga";
            }
        }
        return "catalog";
    }

    @PostMapping("/catalog")
    public String cart2(@RequestParam(name="st") String Str){
        str = Str;
        return "redirect:/catalog";
    }

    @GetMapping("/cs")
    public String cart3(Model model){
        str = null;
        return "redirect:/catalog";
    }

    @GetMapping("/index/{id}")
    public String indexDetails(@PathVariable(value = "id") long id, Model model) {
        Optional<Product> product =  productRepository.findById(id);
        ArrayList<Product> res = new ArrayList<>();
        product.ifPresent(res::add);
        model.addAttribute("product",res);
        if(root!=null) {
            if (root.equals("user")) {
                System.out.println("u");
                return "index-detailsu";
            }
            if (root.equals("admin")) {
                System.out.println("a");
                return "index-detailsa";
            }
        }
        return "index-details";
    }

    @GetMapping("/index/add")
    public String indexAdd(Model model) {
        return "index-add";
    }
    @PostMapping("/index/add")
    public String indexPostAdd(@RequestParam String name, @RequestParam String price, @RequestParam String about, @RequestParam String img,@RequestParam String teg,@RequestParam String tegb,@RequestParam String tegg,@RequestParam String opisanie){
        Product product = new Product(name,price,about,img,teg, tegb, tegg,opisanie,"");
        productRepository.save(product);
        return "redirect:/catalog";
    }
    @PostMapping("/index/{id}/edit")
    public String indexPostUpdate(@PathVariable(value = "id") long id,@RequestParam String name, @RequestParam String price, @RequestParam String about, @RequestParam String img,@RequestParam String teg,@RequestParam String tegb,@RequestParam String tegg,@RequestParam String opisanie, Model model){
        Product product = productRepository.findById(id).orElseThrow();
        product.setName(name);
        product.setPrice(price);
        product.setAbout(about);
        product.setImg(img);
        product.setTeg(teg);
        product.setTegb(tegb);
        product.setTegg(tegg);
        product.setOpisanie(opisanie);
        productRepository.save(product);
        return "redirect:/index/{id}";
    }


    @GetMapping("/index/{id}/edit")
    public String indexEdit(@PathVariable(value = "id") long id, Model model) {
        if(!productRepository.existsById(id)){
            return  "redirect:/index/{id}";
        }
        Optional<Product> product =  productRepository.findById(id);
        ArrayList<Product> res = new ArrayList<>();
        product.ifPresent(res::add);
        model.addAttribute("product",res);
        return "index-edit";
    }


    @PostMapping("/index/{id}/remove")
    public String indexPostDelete(@PathVariable(value = "id") long id){
        Product post = productRepository.findById(id).orElseThrow();
        productRepository.delete(post);
        return "redirect:/index";
    }

}