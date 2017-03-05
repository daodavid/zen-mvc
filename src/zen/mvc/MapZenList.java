package zen.mvc;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="zen")
public class MapZenList {

   
    private List<MapZen> zenBean;
    @XmlElement(name="zenBean")
	public List<MapZen> getZenBean() {
		return zenBean;
	}

	public void setZenBean(List<MapZen> zenBean) {
		this.zenBean = zenBean;
	}


}
