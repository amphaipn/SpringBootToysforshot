package com.amphaipn.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by A on 3/30/2017.
 */

@RestController
public class PageController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
