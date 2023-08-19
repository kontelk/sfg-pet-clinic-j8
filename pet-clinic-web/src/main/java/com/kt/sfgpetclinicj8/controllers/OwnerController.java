package com.kt.sfgpetclinicj8.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kontelk on 8/19/23.
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"/list"})
    public String listOwners() {
        return "owners/list";
    }
}
