package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String getLandingPage(){
        return "<html>" +
                    "<body>" +
                        "<h1>" +
                            "Skills Tracker" +
                        "</h1>" +
                        "<h2>" +
                            "Waffle irons skills for iron clad programmers." +
                        "</h2>" +
                        "<ol>" +
                            "<li>" +
                                "Swift" +
                            "</li>" +
                            "<li>" +
                                "Rust" +
                            "</li>" +
                            "<li>" +
                                "React" +
                            "</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String getForm(){
        return "<html>" +
                    "<body>" +
                        "<form method='POST' action='/form'>" +
                            "Name: <br/>" +
                            "<input type='text' name='name' /><br/>" +
                            "My Favorite Language: <br/>" +
                            "<select name='favoriteLanguage'>" +
                                "<option value='Swift'>Swift</option>" +
                                "<option value='Rust'>Rust</option>" +
                                "<option value='React'>React</option>" +
                            "</select><br/>" +
                            "My Second Favorite Language: <br/>" +
                            "<select name='secondLanguage'>" +
                                "<option value='Swift'>Swift</option>" +
                                "<option value='Rust'>Rust</option>" +
                                "<option value='React'>React</option>" +
                            "</select><br/>" +
                            "My Third Favorite Language: <br/>" +
                            "<select name='thirdLanguage'>" +
                                "<option value='Swift'>Swift</option>" +
                                "<option value='Rust'>Rust</option>" +
                                "<option value='React'>React</option>" +
                            "</select><br/>" +
                            "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String postFormPage(@RequestParam String name, @RequestParam String favoriteLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage){
        return "<html>" +
                    "<body>" +
                        "<h1>" +
                            name +
                        "</h1>" +
                        "<ol>" +
                            "<li>" +
                            favoriteLanguage +
                            "</li>" +
                            "<li>" +
                            secondLanguage +
                            "</li>" +
                            "<li>" +
                            thirdLanguage +
                            "</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }



}
