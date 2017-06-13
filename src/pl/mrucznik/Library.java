package pl.mrucznik;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="biblioteka")
public class Library
{
    private List<Student> students;
    private List<Book> books;

    @XmlElements(@XmlElement(name="student"))
    public List<Student> getStudents() {
        return students;
    }

    @XmlElements(@XmlElement(name="ksiazka"))
    public List<Book> getBooks() {
        return books;
    }

    public Library() {
        this.students = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public Student addStudent(Student student)
    {
        students.add(student);
        return student;
    }

    public Book addBook(Book book)
    {
        books.add(book);
        return book;
    }

    public void rentABook(Book book, Student student)
    {
        book.rent(student);
    }

    public Book getBook(String title)
    {
        for (Book book : books)
        {
            if(book.getTitle().equals(title))
            {
                return book;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public void loadData(String filename)
    {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveData(String filename)
    {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
