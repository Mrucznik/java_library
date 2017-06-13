package pl.mrucznik;

import javax.xml.bind.annotation.*;
import java.util.Date;

public class Book
{
    private String title;
    private Date releaseDate;
    private boolean avaible;
    private Student rentier;

    public Book(String title, Date releaseDate, boolean avaible) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.avaible = avaible;
    }

    public Book(String title, Date releaseDate, boolean avaible, Student rentier) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.avaible = avaible;
        this.rentier = rentier;
    }

    public void rent(Student student)
    {
        rentier = student;
    }

    public void unrent(Student student)
    {
        rentier = null;
    }

    public String getTitle()
    {
        return title;
    }

    @XmlAttribute(name="date")
    public Date getReleaseDate() {
        return releaseDate;
    }

    @XmlAttribute(name="avaible")
    public boolean isAvaible() {
        return avaible;
    }

    @XmlElement(name="rentier")
    public Student getRentier() {
        return (rentier != null) ? rentier : new Student("Nrak", "Brak", new Date(0,0,0));
    }
}
