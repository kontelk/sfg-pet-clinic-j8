package com.kt.sfgpetclinicj8.controllers;

import com.kt.sfgpetclinicj8.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kontelk on 8/19/23.
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/ownersList"})
    public String listOwners(Model model) {

        model.addAttribute("owners",
                ownerService.findAll());
        return "owners/ownersList";
    }
}
