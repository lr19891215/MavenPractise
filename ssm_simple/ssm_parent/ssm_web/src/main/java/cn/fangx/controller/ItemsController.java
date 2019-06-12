package cn.fangx.controller;

import cn.fangx.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    ItemsService itemsService;

    @RequestMapping("/test")
    public String itemsTest(Model model){
        model.addAttribute("item",itemsService.findById(1));
        return "itemDetail";
    }
}
