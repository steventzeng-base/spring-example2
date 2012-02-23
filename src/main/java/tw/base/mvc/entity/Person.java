/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.base.mvc.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steven
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Person {

    private String name;

    private Long id;

    private int age;

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
