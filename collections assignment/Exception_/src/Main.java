import java.util.Scanner;

public class Main {
	
static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
	try {
		//
		//
		throw new MyException();
	}
catch(MyException e) {
	XMLUtlility x=new XMLUtlility();
	x.loadAndParseXML("ExceptionConfig.xml");
	ExceptionHandler eh=new ExceptionHandler();
	eh.handle("A","m1", e);

	
	//////////////////////////////////
	KeyActionAttrMap keyActionAttrMap1 = new KeyActionAttrMap();
	String st=eh.key;
	keyActionAttrMap1.setKey(st);
	ActionAttrMap[] actions1 = new ActionAttrMap[4];		
	ActionAttrMap actionAttrMap1 = new ActionAttrMap();
	keyActionAttrMap1.setActionsAttrMap(actions1);
	AttrNVMap[] attrbutesForEMail = new AttrNVMap[3];
	for(int i=0;i<3;i++) {
	attrbutesForEMail[0] = new AttrNVMap("to","A@b.com");
	attrbutesForEMail[1] = new AttrNVMap("cc","x@y.com");
	attrbutesForEMail[2] = new AttrNVMap("subject","Somehting");
	}
	actionAttrMap1.setActionName("Email");
	actionAttrMap1.setAttrMap(attrbutesForEMail);
	actions1[0] = actionAttrMap1;	
	
	
	ActionAttrMap actionAttrMap2 = new ActionAttrMap();
	actionAttrMap2.setActionName("Log");
	AttrNVMap[] attrbutesForLog = new AttrNVMap[1];
	attrbutesForLog[0] = new AttrNVMap("file","c:\\a.txt");
	actionAttrMap2.setAttrMap(attrbutesForLog);
	actions1[1] = actionAttrMap2;
	ActionAttrMap actionAttrMap3 = new ActionAttrMap();
	actionAttrMap3.setActionName("Retry");
	actions1[2] = actionAttrMap3;
	actionAttrMap2.setAttrMap(attrbutesForLog);
	ActionAttrMap actionAttrMap4 = new ActionAttrMap();
	actionAttrMap4.setActionName("Abort");
	actions1[3] = actionAttrMap4;
	System.out.println("For First Key "+keyActionAttrMap1.toString());
	KeyActionAttrMap keyActionAttrMap2 = new KeyActionAttrMap();
	keyActionAttrMap2.setKey("A#m2#YourException");
}
}

	
}
