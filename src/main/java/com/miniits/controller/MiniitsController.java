package com.miniits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: miniits
 * @Date:
 * @Time: <p>
 * Description:
 */
@Controller
@RequestMapping("/miniits")
public class MiniitsController {

    @RequestMapping("index")
    public String index(ModelMap modelMap) {
        return "index";
    }

}