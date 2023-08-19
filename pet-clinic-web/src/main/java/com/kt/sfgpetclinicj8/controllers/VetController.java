package com.kt.sfgpetclinicj8.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kontelk on 8/19/23.
 */
@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"/list"})
    public String listVets() {
        return "vets/list";
    }
}
