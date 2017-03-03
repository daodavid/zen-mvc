package zen.mvc;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConvertZenToObject {
   public void A(){
   try {
	     File file = new File("zen.xml");  
	       JAXBContext jaxbContext = JAXBContext.newInstance(MapZen.class);  
	  
	       Unmarshaller jaxbUnmarshaller;
		jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	    MapZen z= (MapZen) jaxbUnmarshaller.unmarshal(file);
	    System.out.println(z.getPath());
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
    
   }
}
