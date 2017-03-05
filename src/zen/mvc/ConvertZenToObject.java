package zen.mvc;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConvertZenToObject {

static List<MapZen> maps;
	static {
		   try {
			     File file = new File("C:/projects/zen-mvc/zen.xml");  
			       JAXBContext jaxbContext = JAXBContext.newInstance(MapZenList.class);  
			  
			       Unmarshaller jaxbUnmarshaller;
				jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			    MapZenList z= (MapZenList) jaxbUnmarshaller.unmarshal(file);
			    maps= z.getZenBean();
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
	}
   public static List<MapZen> getMapping(){
        return maps;
}
   public static MapZen getMapping(String path){
	   for(MapZen a:maps){
		   if(a.getPath().equals(path));
		   return a;
	   }
	   return null;
   }
   
}