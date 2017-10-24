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

    String[] colors = {"red", "green", "blue", "yellow", "pink", "orange", "black", "mediumslateblue", "fuchsia", "salmon", "chartreuse"};

    public String getColour() {
        return "color:" + colors[r.nextInt(colors.length)];
    }

    public String getSize() {
        return "font-size:" + r.nextInt(40) + "px";
    }

    public String getHello() {
        return hellos[r.nextInt(hellos.length)];
    }

    @RequestMapping(value="/web/greetall")
    public String greetEveryone(Model model) {
        model.addAttribute("style", getColour() + ";" + getSize());
        model.addAttribute("text", getHello() + "!");

        return "greetall";
    }

}
