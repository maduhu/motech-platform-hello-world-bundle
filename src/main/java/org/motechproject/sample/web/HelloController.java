package org.motechproject.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/status")
    @ResponseBody
    public String status() {
        return "Hello Bundle Up and Running";
    }

}
