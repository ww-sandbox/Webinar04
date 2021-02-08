package ex2_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex1_StringExamples {
    public static void main(String[] args) {
        String name = "Adam";
        String surname = "Nowak";
        int wiek = 24;

        System.out.println(name + surname); //jak poprawić wyświetlanie?

        //System.out.printf("%s %s",name,surname);

        //Wyświelt 'Imie: ..., Nazwisko: ..., wiek: ...'

        String aboutAla = String.join(" ", "Ala", "ma", "kota", "gdyby", "nie", "miała", "kota", "miała", "by", "psa");
        System.out.println(aboutAla);

        List<String> numbers = Arrays.asList("000","111","222");
        //Na podstawie listy numbers stwórz i wyświetl String zawierający numer telefonu rozdzielony '-'
        //Temat list zostanie omówiony dokładniej na kolejnych etapach kursu

        String text = "Tekst do podzielenia";
        System.out.println(Arrays.toString(text.split(" ")));

        System.out.println(aboutAla.substring(0,3));
        //Z wykorzystaniem substring wyświetl 'kota'

        System.out.println(aboutAla.replace("Ala", "Tola"));
        //podmień wszystkie wystąpienia 'kota' na 'chomika'


    }
}
