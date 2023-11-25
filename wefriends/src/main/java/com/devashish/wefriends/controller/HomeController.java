package com.devashish.wefriends.controller;

import com.devashish.wefriends.entity.Engagement;
import com.devashish.wefriends.repository.EngagementRepo;
import com.devashish.wefriends.service.EngagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    EngagementService engagementService;

    @GetMapping("/home")
    public String getHome(Model model){
        return "homepage";
    }
    @GetMapping("/account")
    public String account(Model model){
        model.addAttribute("engg", new Engagement());
        return "account";
    }

    @PostMapping("/account")
    public String postEngagement(@ModelAttribute Engagement engg,Model model){
        model.addAttribute("engg", engg);
        Engagement enggToSave = new Engagement();
        enggToSave.setName(engg.getName());
        enggToSave.setCity(engg.getCity());
        engagementService.saveEngagement(enggToSave);

        return "account";
    }
    @RequestMapping("/get_engagement")
    String getEngagement() {
        return "login";
    }
}
