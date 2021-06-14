package com.example.Routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
    @RequestMapping(value = "/{name}" , method=RequestMethod.GET)
    public String dojo(@PathVariable("name") String name) {
        if(name.equals("dojo")){
                return "The " +name+ " is awesome!";}
        
        else if(name.equals("burbank-dojo")) {
            return "Burbank Dojo is located in Southern California!";}
        
        else if(name.equals("san-jose")) {
            return "SJ dojo is the headquarters";}
        
        else { 
        	return "No dojo!";
        }
    }
}