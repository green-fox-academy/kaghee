package com.greenfox.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;

@Controller
public class HelloToAllTheWorld {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    Random r = new Random();

    public String getColour() {
        return "color: rgb(" + r.nextInt(256) + "," + r.nextInt(256) + "," + r.nextInt(256) + ")";
    }

    public String getSize() {
        return "font-size:" + (Math.random() * 50 + 15) + "px";
    }

    public String getHello() {
        return hellos[r.nextInt(hellos.length)];
    }

    @RequestMapping(value="/web/greetall")
    public String greetEveryone(Model model) {
        model.addAttribute("style", getColour() + ";" + getSize() + ";font-family:sans-serif;font-weight:bold");
        model.addAttribute("text", getHello() + "!");

        return "greetall";
    }
}
