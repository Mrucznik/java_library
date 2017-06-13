package pl.mrucznik;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Date birthDate;

    public Student(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    @XmlAttribute(name="imie")
    public String getName() {
        return name;
    }

    @XmlAttribute(name="nazwisko")
    public String getSurname() {
        return surname;
    }

    @XmlAttribute(name="dataUr")
    public Date getBirthDate() {
        return birthDate;
    }
}
