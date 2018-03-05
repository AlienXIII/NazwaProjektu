/**
 * Created by hp on 05.03.2018.
 */
public class Osoba {
    private String imie;
    private String nazwisko;
    private String email;
    private int dzienUrodzenia, miesiacUrodzenia, rokUrodzenia;
    Osoba (String imie,String nazwisko,String email,int dU, int mU, int rU) {
        this.imie = imie; this.nazwisko = nazwisko; this.email = email; this.dzienUrodzenia=dU; this.miesiacUrodzenia=mU;
        this.rokUrodzenia=rU;
    }
    Osoba(){}

    String jakSieCzujesz() {
        return "Kiepsko!";
    }
        String jakSieCzujesz(int skala){
         String samopoczucie = "Slabo";
            if (skala > 5){samopoczucie = "świetnie";
        } else if (skala ==0){
                    samopoczucie = "Tragicznie!";
        }

            return samopoczucie;
    }


    String getImie(){
        return this.imie;
        }
    String getEmail(){
        return this.email;

    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getDzienUrodzenia() {
        return dzienUrodzenia;
    }

    public int getMiesiacUrodzenia() {
        return miesiacUrodzenia;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setMiesiacUrodzenia(int miesiacUrodzenia) {
        this.miesiacUrodzenia = miesiacUrodzenia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDzienUrodzenia(int dzienUrodzenia) {
        this.dzienUrodzenia = dzienUrodzenia;
    }

    public void setNazwisko(String nazwisko) {

        this.nazwisko = nazwisko;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }
}

