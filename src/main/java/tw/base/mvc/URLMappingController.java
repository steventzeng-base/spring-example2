/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.base.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author steven
 */
@Controller
@RequestMapping("/urlmap")
public class URLMappingController {

    @RequestMapping("/url")
    public @ResponseBody
    String url() {
        return "by url";
    }

    @RequestMapping(value = "/param", params = "action=list")
    public @ResponseBody
    String param() {
        return "<h1>by param <strong>list</strong></h1>";
    }

    @RequestMapping(value = "/param", params = "action=form")
    public @ResponseBody
    String param2() {
        return "<h1>by param <strong>Form</strong></h1>";
    }

    @RequestMapping(value = "/method", method = RequestMethod.GET)
    public @ResponseBody
    String methodGet() {
        return "<form method='post'>Please input your name <input name='name'/><input type='submit' value='submit'/></form>";
    }

    @RequestMapping(value = "/method", method = RequestMethod.POST)
    public @ResponseBody
    String methodPost(@RequestParam String name) {
        return "<h1>Hello " + name + "</h1>";
    }

    @RequestMapping(value = "/header", headers="accept=text/plain")
    public @ResponseBody
    String mineText() {
        return "<h1>Hello text/plain</h1>";
    }
    @RequestMapping(value = "/header", headers="accept=application/json")
    public @ResponseBody String mimeJson(){
            return "[{name:'Peter', age:20}, {name:'May', age:19}]";
    }
}
