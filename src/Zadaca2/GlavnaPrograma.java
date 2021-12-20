package Zadaca2;

import java.util.ArrayList;
import java.util.List;

public class GlavnaPrograma {
    public static void main(String[] args) {

        List<Vraboten> v = new ArrayList<Vraboten>();

        v.add(new Vraboten("Ana", "Aleksovska", "15000"));
        v.add(new Vraboten("Ivana", "Ivanovska", "10000"));
        v.add(new Vraboten("Anastasija", "Petrovska", "50000"));

        XML xml = new XML();
        xml.createXMLFile("xml.xml", v);
    }
}
