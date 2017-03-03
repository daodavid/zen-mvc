package zen.mvc;

import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="zenBean")
public class MapZen {

	private String actionClass;
	
	private String path;
	
	private String forward;

	private String viewClass;
	 
	public String getActionClass() {
		return actionClass;
	}
	 @XmlElement
	public void setActionClass(String actionClass) {
		this.actionClass = actionClass;
	}
	public String getPath() {
		return path;
	}
	 @XmlElement
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getForward() {
		return forward;
	}
	 @XmlElement
	public void setForward(String forward) {
		this.forward = forward;
	}

	public String getViewClass() {
		return viewClass;
	}
	 @XmlElement
	public void setViewClass(String viewClass) {
		this.viewClass = viewClass;
	}

	
}