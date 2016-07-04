package com.cht.inception.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OopsController implements ErrorController {


    @Override
    public String getErrorPath() {
        return "oops";
    }

    @RequestMapping("/oops")
    public String oops() {
        return "oops";
    }
}
