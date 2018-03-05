/**
 * Created by hp on 05.03.2018.
 */
public class Start {
public static void main(String[] args) {
    String zmienna = "Cokolwiek";

    String []tablica = {"pierwszy","drugi","trzeci"};




    Float poprzecinku = 123.234f;
    Long dlugaliczba = 1077888566677l;
    boolean prawda = true;

    Osoba person = new Osoba("zdzichu","pierdzipompka","zdzichu@onet.pl",12,2,1990);
    Employee person2 = new Employee();

    person.setImie("Kalasanty");
    System.out.println(person.getImie()+","+person.getEmail()+","+person.getRokUrodzenia());
    System.out.println(person.jakSieCzujesz(0));

}




}
