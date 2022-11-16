package com.example.chat;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Locale;

@Controller
@Log4j2
public class ChatController {

    @GetMapping(value = "/chat.do")
    public String chat(Locale locale, Model model) {
        return "chat";
    }
}
