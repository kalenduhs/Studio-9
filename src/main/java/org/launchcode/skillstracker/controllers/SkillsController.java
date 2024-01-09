package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @ResponseBody
    @GetMapping
    public String hello() {
        return
                "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here's the list!</h2>" +
                        "<ol><li>Java</li><li>JavaScript</li><li>Python</li></ol>";
    }

    @ResponseBody
    @GetMapping("form")
    public String form() {
            String html =
                    "<html>" +
                            "<body>" +
                            "<form method = 'post' action = '/form'>" +
                            "<label for= 'namebox'>First name:</label><br>" +
                            "<input type = 'text' name = 'namebox' /><br>" +
                            "<label for= 'fav'>My favorite language:</label><br>\n" +
                            "<select name= 'fav' id= 'fav' form= 'favform'>\n" +
                            "  <option value= 'Java'>Java</option>\n" +
                            "  <option value= 'Javascript'>Javascript</option>\n" +
                            "  <option value= 'Python'>Python</option>\n" +
                            "</select><br>" +
                            "<label for= 'fav'>My second favorite language:</label><br>\n" +
                            "<select name= 'fav2' id= 'fav' form= 'favform'>\n" +
                            "  <option value= 'Java'>Java</option>\n" +
                            "  <option value= 'Javascript'>Javascript</option>\n" +
                            "  <option value= 'Python'>Python</option>\n" +
                            "</select><br>" +
                            "<label for= 'fav'>My third favorite language:</label><br>\n" +
                            "<select name= 'fav3' id= 'fav' form= 'favform'>\n" +
                            "  <option value= 'Java'>Java</option>\n" +
                            "  <option value= 'Javascript'>Javascript</option>\n" +
                            "  <option value= 'Python'>Python</option>\n" +
                            "</select><br>" +
                            "<input type = 'submit' value = 'Submit' />" +
                            "</form>" +
                            "</body>" +
                            "</html>";
            return html;
        }

        @PostMapping(value = "form")
        @ResponseBody()
        public String formsss (@RequestParam String namebox) {
            return "<h1>" + namebox + "</h1> + " +
                    "<ol><ol>";
        }
    }

