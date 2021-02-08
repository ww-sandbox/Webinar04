package ex2_String;

public class ex2_StringComparationsExample {
    public static void main(String[] args) {
        String name = "Adam";
        String sameName = "Adam";
        String smallName = "adam";
        String anotherName = "Tomasz";
        String newSameName = new String ("Adam");

        System.out.printf("Takie same");
        System.out.printf("\n%s | %s | %b", name, sameName, name == sameName);
        System.out.printf("\n\nMała litera");
        System.out.printf("\n%s | %s | %b", name, smallName, name == smallName);
        System.out.printf("\n\nNowy String");
        System.out.printf("\n%s | %s | %b", name, newSameName, name == newSameName);
        System.out.printf("\n\nNowy string equals");
        System.out.printf("\n%s | %s | %b", name, newSameName, name.equals(newSameName));
        System.out.printf("\n\nMała litera equals");
        System.out.printf("\n%s | %s | %b", name, smallName, name.equals(smallName));
        System.out.printf("\n\nMala litera equals ignoreCase");
        System.out.printf("\n%s | %s | %b", name, smallName, name.equalsIgnoreCase(smallName));
        System.out.printf("\n\nRózne teksty");
        System.out.printf("\n%s | %s | %b", name, anotherName, name.equalsIgnoreCase(anotherName));

    }
}
