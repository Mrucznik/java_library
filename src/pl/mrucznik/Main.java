package pl.mrucznik;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Library l = new Library();
        Student kox = l.addStudent(new Student("Kox", "Pr0x", new Date(1,2,3)));
        l.addBook(new Book("test", new Date(4,5,6), true));
        l.addBook(new Book("test2", new Date(4,5,6), true, kox));
        l.addBook(new Book("test3", new Date(4,5,6), true));

        l.saveData("books.txt");

        l.loadData("books.txt");

        try {
            //Write it
            JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //WYŚWIETLENIE NA OUT
            jaxbMarshaller.marshal(l, System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
