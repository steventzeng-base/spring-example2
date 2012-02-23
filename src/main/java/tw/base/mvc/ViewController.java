/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.base.mvc;

import com.sun.syndication.feed.rss.Channel;
import java.io.IOException;
import java.io.Writer;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXB;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tw.base.mvc.entity.Person;

/**
 *
 * @author steven
 */
@Controller
public class ViewController {

    @RequestMapping("/view/gender")
    public String gender(@RequestParam String gender) {
        return "boy".equals(gender) ? "boy" : "girl";
    }

    @RequestMapping("/view/home")
    public void defaultView(Model model) {
        model.addAttribute("name", "john");
    }

    @RequestMapping("/view/pathvar/{name}/{age}")
    public String pathVar(@PathVariable String name, @PathVariable int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "view/pathvar";
    }

    @RequestMapping("/view/result")
    public String result(@RequestParam boolean check) {
        return "view/" + (check ? "success" : "failure");
    }

    @RequestMapping(value = "view/person", params = "id")
    public String person(@RequestParam Long id, Model model) {
        Person person = new Person();
        person.setName("John");
        person.setAge(19);
        person.setId(id);
        model.addAttribute(person);
        return "view/person";
    }

    @RequestMapping("view/people/{id}/data.json")
    public void json(HttpServletResponse response, @PathVariable Long id) throws IOException {
        Person person = new Person();
        person.setName("John");
        person.setAge(19);
        person.setId(id);
        ObjectMapper mapper = new ObjectMapper();
        response.setContentType("application/json");
        mapper.writeValue(response.getWriter(), person);
    }

    @RequestMapping("view/people/{id}/data.xml")
    public void xml(Writer writer, @PathVariable Long id) throws IOException {
        Person person = new Person();
        person.setName("John");
        person.setAge(19);
        person.setId(id);
        JAXB.marshal(person, writer);
    }

    @RequestMapping("view/people/{id}")
    public @ResponseBody
    Person data(@PathVariable Long id) {
        Person person = new Person();
        person.setName("John");
        person.setAge(19);
        person.setId(id);
        return person;
    }
}
