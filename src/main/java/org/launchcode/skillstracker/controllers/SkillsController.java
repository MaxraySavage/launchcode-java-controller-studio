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
                        "<form method='POST' action='/result'>" +
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

    @PostMapping("/result")
    @ResponseBody
    public String postFormPage(@RequestParam String name, @RequestParam String favoriteLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage){
        return "<html>" +
                    "<body>" +
                        "<h1>" +
                            name +
                        "</h1>" +
                        "<table>" +
                            "<tr>" +
                                "<th>Favorite Language</th>" +
                                "<th>" +
                                    favoriteLanguage +
                                "</th>" +
                            "</tr>" +
                            "<tr>" +
                                "<th>Second Favorite Language</th>" +
                                "<th>" +
                                secondLanguage +
                                "</th>" +
                            "</tr>" +
                            "<tr>" +
                                "<th>Third Favorite Language</th>" +
                                "<th>" +
                                    thirdLanguage +
                                "</th>" +
                            "</tr>" +
                        "</table>" +
                    "</body>" +
                "</html>";
    }



}
