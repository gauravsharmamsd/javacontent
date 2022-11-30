import java.util.Arrays;

//Clean Code..........
public class KeyActionAttrMap {
	private String key; //"A#m1#MyException"
	private ActionAttrMap[] actionsAttrMap;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public ActionAttrMap[] getActionsAttrMap() {
		return actionsAttrMap;
	}
	public void setActionsAttrMap(ActionAttrMap[] actionsAttrMap) {
		this.actionsAttrMap = actionsAttrMap;
	}
	@Override
	public String toString() {
		return "KeyActionAttrMap [key=" + key + ", actionsAttrMap=" + Arrays.toString(actionsAttrMap) + "]";
	}

}

class ActionAttrMap{
	private String actionName;//Email  Log
	private AttrNVMap[] attrMap;//to="a@b.com"...
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	public AttrNVMap[] getAttrMap() {
		return attrMap;
	}
	public void setAttrMap(AttrNVMap[] attrMap) {
		this.attrMap = attrMap;
	}
	@Override
	public String toString() {
		return "ActionAttrMap [actionName=" + actionName + ", attrMap=" + Arrays.toString(attrMap) + "]";
	}
	
}
class AttrNVMap{
	private String attrName;
	private String attrValue;
	public AttrNVMap(String name, String value){
		this.attrName = name;
		this.attrValue = value;
	}
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	public String getAttrValue() {
		return attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	@Override
	public String toString() {
		return "AttrNVMap [attrName=" + attrName + ", attrValue=" + attrValue + "]";
	}
	
	
}
