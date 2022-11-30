package com.rkit;
//Clean Code..........
public class KeyActionAttrMap {
	private String key; //"A#m1#MyException"
	private ActionAttrMap[] actionsAttrMap;

}

class ActionAttrMap{
	private String actionName;//Email  Log
	private AttrNVMap[] attrMap;//to="a@b.com"...
}
class AttrNVMap{
	private String attrName;
	private String attrValue;
	public AttrNVMap(String name, String value){
		this.attrName = name;
		this.attrValue = value;
	}
	
}
