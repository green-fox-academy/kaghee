package com.greenfox.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.Random;

@Controller
public class HelloToAllTheWorld {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};



    Random r = new Random();
//    Color colour = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));

    Color colour = Color.RED;
    public Color getColour() {
        return colour;
    }

    public String getHello() {
        String result = "";
        for (int i = 0; i < hellos.length; i++) {
            result += hellos[i] + " ";
        }
        return result;
    }

    @RequestMapping(value="/web/greetall")
    public String greetEveryone(Model model) {
        model.addAttribute("style", colour);
        model.addAttribute("text", getHello());



        return "greetall";
    }

}
