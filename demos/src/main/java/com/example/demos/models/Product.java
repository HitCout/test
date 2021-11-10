package com.example.demos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name, price, about, img, teg, tegb, tegg, opisanie, bucket;

    public Long getId(){
        return id;
    }

    public void  setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }

    public String getPrice(){
        return price;
    }

    public  void setPrice(String price){
        this.price = price;
    }

    public String getAbout(){
        return about;
    }

    public  void setAbout(String about){
        this.about = about;
    }

    public String getImg(){
        return img;
    }

    public  void setImg(String img){
        this.img = img;
    }

    public String getTeg(){
        return teg;
    }

    public  void setTeg(String teg){
        this.teg = teg;
    }

    public String getTegb(){
        return tegb;
    }

    public  void setTegb(String tegb){
        this.tegb = tegb;
    }

    public String getTegg(){
        return tegg;
    }

    public  void setTegg(String tegg){
        this.tegg = tegg;
    }

    public String getOpisanie(){
        return opisanie;
    }

    public  void setOpisanie(String opisanie){
        this.opisanie = opisanie;
    }

    public String getBucket(){
        return bucket;
    }

    public  void setBucket(String bucket){
        this.bucket = bucket;
    }

    public Product() {
    }

    public Product(String name, String price, String about, String img, String teg, String tegb, String tegg, String opisanie, String bucket) {
        this.name = name;
        this.price = price;
        this.about = about;
        this.img = img;
        this.teg = teg;
        this.tegb = tegb;
        this.tegg = tegg;
        this.opisanie = opisanie;
        this.bucket = bucket;
    }
}
