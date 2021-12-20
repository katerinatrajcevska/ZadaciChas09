package Zadaca1;

public class GlavnaPrograma {
    public static void main(String[] args) {
        Vraboten vraboten = new Vraboten();
        vraboten.setIme("Stefan");
        vraboten.setPrezime("Stefanovski");
        vraboten.setPlata("10000");

        XML xml = new XML();
        xml.createXMLFile("xml.xml", vraboten);
    }
}
