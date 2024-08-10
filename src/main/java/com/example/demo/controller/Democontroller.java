package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Democontroller {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "Demon");
        return "hello";
    }

    @GetMapping("hello2")
    public String hello2(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello2_template";
    }

    @GetMapping("hello3")
    @ResponseBody
    public Hello hello3(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}

