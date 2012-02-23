/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.base.mvc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import tw.base.mvc.entity.Person;

/**
 *
 * @author steven
 */
@Controller
@RequestMapping("/modelSession")
public class ModelController {
    @ModelAttribute("persons")
    public List<Person> persons(){
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(1L, "May", 20));
        persons.add(new Person(1L, "Joe", 21));
        persons.add(new Person(1L, "Will", 23));
        persons.add(new Person(1L, "Tina", 22));
        return persons;
    }
    @RequestMapping("/home")
    public void index(){
    }

}
