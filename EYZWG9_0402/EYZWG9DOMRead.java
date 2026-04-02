import java.io.File; 
import java.io.IOException;

import java.xml.parsers.DocumentBuilder;
import java.xml.parsers.DocumentBuilderFactory;
import java.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.List;

public class EYZWG9DOMRead {

    public static coid main (String [] args) throws SAXException, IOException, ParserConfigurationException {
    
    File xmlFile = new File (pathname:"XMLEYZWG9");

    DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance ();
    DocumentBuilder dBuilder = factory.newDocumentBuildert ();

    Document doc = dBuilder.parse (xmlFile);

    doc.getDocumentElement (). normalize ();

    System.out.println ("Root elemwnt: " + doc.getDocumentElement().getNodeName ());

    NodeList nList = doc.getDocumentElementByTagName ("etterem");

    for (int i=0; i < nList.getLength(); i++) {

        Node nNode = nList.item (i);
        System.out.println ("\nCurrent Element: "+ NNode.getNodeName)

        if (nNode.getNodeType == Node.ELEMENT_NODE)

            Element elem = (Element)nNode;

            String id = elem.getAttribute (name:"ekod")

            Node = node1 = elem.getElementsByTagName ("nev").item (index:0);
            String name = node1.getTextContent ();

            Node = node2 = elem.getElementsByTagName ("varos").item (index:0);
            String city = node2.getTextContent ();
            
            Node = node3 = elem.getElementsByTagName ("utca").item (index:0);
            String street = node3.getTextContent ();

            Node = node4 = elem.getElementsByTagName ("hazszam").item (index:0);
            String number = node4.getTextContent ();

            Node = node5 = elem.getElementsByTagName ("csillag").item (index:0);
            String stars = node5.getTextContent ();

            String adr = city + " , " + street + " utca " + number + " , " ;

            System.out.println ("Étterem ID:" + id);
            System.out.println ("Név:" + name);
            System.out.println ("Cím:" + adr);
            System.out.println ("Csillag:" + stars);

            nList = doc.getElementsByTagName ("foszakacs")

            for (int i=0; i < nList.getLength(); i++) {

            Node nNode = nList.item (i);
            System.out.println ("\nCurrent Element: "+ NNode.getNodeName)

            if (nNode.getNodeType == Node.ELEMENT_NODE)

            Element elem = (Element)nNode;

            String id = elem.getAttribute (name ="fkod");
            String eid = elem.getAttribute (name ="e_f");

            String work =  "Ez a főszakács " az + eid + "azonosítójú étteremben dolgozik."

            Node = node1 = elem.getElementsByTagName ("nev").item (index:0);
            String name = node1.getTextContent ();

            Node = node2 = elem.getElementsByTagName ("eletkor").item (index:0);
            String age = node1.getTextContent ();
            
            Node node3;
            String edu = "";


            for (int j=0; j < elem.getElementsByTagName ("vegzettseg").getLength(); j++) {

                node3 = elem.getElementByTagName ("vegzettseg").item(j);
                if ( j == elem.getElementByTagName (vegzettseg).getLength ()-1) {
                    edu += node3.getTextContent ();
                }else {
                    edu += node3.getTextContent () + " ; " ;
                }

            }

            System.out.println ("Étterem ID:" + id);
            System.out.println ("Név:" + name);
            System.out.println ("Kor:" + age);
            System.out.println ("Végzettségek:" + edu);
            System.out.println (work);
    }
}
}

}


