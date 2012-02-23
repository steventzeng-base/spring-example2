/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.base.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import tw.base.mvc.entity.Person;

/**
 *
 * @author steven
 */
@Controller
@RequestMapping("modelSession")
@SessionAttributes("user")
public class SessionController {
    @ModelAttribute("user")
    public Person user(){
        return new Person();
    }

    @RequestMapping("login")
    public String login(){
        return "modelSession/login";
    }
    @RequestMapping(value= "login", method= RequestMethod.POST)
    public String doLogin(@ModelAttribute("user")Person user){
        return "modelSession/main";
    }
}
