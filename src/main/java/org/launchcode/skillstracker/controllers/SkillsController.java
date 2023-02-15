package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping("/")
    @ResponseBody
    public String displayHomePage(){
        return  "<html>"+
                "<body>"+
                "<h1>Skills Tracker</h1>"+
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>"+
                "<ol>" +
                "<li>Java</li>"+
                "<li>JavaScript</li>"+
                "<li>Python</li>"+
                "</ol>"+
                "</body>"+
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String displayForm(){
        return  "<html>"+
                "<body>"+
                "<form action = 'show' method = 'post'>"+ //submits a request to /show
                "<h3>"+
                "<label>Name:</label>"+
                "<br>"+
                "<input type = 'text' name = 'name'/>"+
                "<br>"+
                "<label>My favorite language:</label>"+
                "<br>"+
                "<select name = 'first' id = 'first'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>"+
                "<br>"+
                "<label>My second favorite language:</label>"+
                "<br>"+
                "<select name = 'second' id = 'second'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>"+
                "<br>"+
                "<label>My third favorite language:</label>"+
                "<br>"+
                "<select name = 'third' id = 'third'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>"+
                "<br>"+
                "<input type = 'submit' value = 'Submit'/>"+
                "</h3>"+
                "</form>"+
                "</body>"+
                "</html>";
    }

    @PostMapping("show")
    @ResponseBody
    public String viewDetails(@RequestParam String name,@RequestParam String first,
                              @RequestParam String second,@RequestParam String third){
        return  "<html>" +
                "<body>"+
                "<h1>"+name+"</h1>"+
                "<br>"+
                "<h3>" +
                "<ol>"+
                "<li>"+first+"</li>"+
                "<li>"+second+"</li>"+
                "<li>"+third+"</li>"+
                "</h3>"+
                "</body>"+
                "</html>";
    }

}
