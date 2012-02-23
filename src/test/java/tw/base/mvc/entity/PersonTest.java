/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.base.mvc.entity;

import static org.junit.Assert.*;

import java.io.StringWriter;
import javax.xml.bind.JAXB;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

/**
 *
 * @author steven
 */
public class PersonTest {

    @Test
    public void toJson() throws Exception {
        Person person = new Person();
        person.setName("John");
        person.setAge(19);
        person.setId(100L);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(person);
        assertEquals("{\"name\":\"John\",\"id\":100,\"age\":19}", json);
    }

    @Test
    public void toXml() throws Exception{
        Person person = new Person();
        person.setName("John");
        person.setAge(19);
         person.setId(100L);
        StringWriter writer = new StringWriter();
        JAXB.marshal(person, writer);
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<person id=\"100\">\n    <age>19</age>\n    <name>John</name>\n</person>\n", writer.toString());
    }
}
