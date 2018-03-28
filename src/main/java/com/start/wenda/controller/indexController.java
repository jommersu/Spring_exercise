package com.start.wenda.controller;

import com.start.wenda.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class indexController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Hello!";
    }

    @RequestMapping(value = {"/profile/{group}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("group") String group,
                          @PathVariable("userId") int userId,
                          @RequestParam(value = "type") int type,
                          @RequestParam(value = "key",defaultValue = "k") String key){
        return String.format("Page of group %s user %d, type: %d , key : %s",group,userId,type,key);
    }

    @RequestMapping(path = {"/vm"},method = {RequestMethod.GET})
    public String template(Model model){
        model.addAttribute("value1","hello1");

        List<String> colors = Arrays.asList(new String[] {"blue","red"});
        model.addAttribute("colors",colors);

        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i),String.valueOf(i * i));
        }
        model.addAttribute("map",map);

        model.addAttribute("User", new User("wang"));
        return "home";
    }

}
