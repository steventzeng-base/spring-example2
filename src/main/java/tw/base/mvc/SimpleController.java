/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.base.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author steven
 */
@Controller
public class SimpleController {
    @RequestMapping("/home")
    public String index(Model model){
            model.addAttribute("name", "John");
            return "home";
    }
}
