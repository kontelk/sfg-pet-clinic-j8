package com.kt.sfgpetclinicj8.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kontelk on 8/19/23.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping({"oups"})
    public String oupsHandler() {
        return "notimplemented";
    }

    @RequestMapping({"help"})
    public String help() {
        return "help";
    }

    @RequestMapping({"support"})
    public String support() {
        return "support";
    }
}
