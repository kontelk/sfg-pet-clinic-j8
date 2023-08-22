package com.kt.sfgpetclinicj8.controllers;

import com.kt.sfgpetclinicj8.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kontelk on 8/19/23.
 */
@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    //@Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vetsList"})
    public String listVets(Model model) {
        model.addAttribute("vets",
                vetService.findAll());
        return "vets/vetsList";
    }
}
