package com.soc6graph.socgraph.controller;

import com.soc6graph.socgraph.config.FacebookSettings;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class MainController {

    private final FacebookSettings facebookSettings;

    @GetMapping
    public String index(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("appId", facebookSettings.getAppId());

        return "index";
    }
}
