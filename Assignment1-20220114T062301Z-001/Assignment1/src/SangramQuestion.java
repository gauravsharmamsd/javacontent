
public class SangramQuestion {

	public static void main(String[] args) {
		//StringPool 
		//Storage of frequently used Strings is optimized using StringPool
		//Global space allocated for frequently used Strings.
		String s1 = "Hello";//This object of String is Stored into Global space called String Pool
		String s2 = "Hello";//String literal , No need to create another duplicate String object but just get
		                    //reference of "Hello" from StringPool
		
		System.out.println(s1==s2);//This should print true
		
		String s3 = new String("Hello");//This is not String literal So JVM will create a seperate "Hello";
		System.out.println(s1==s3); //This prints false.
		
		//String objects are immutable
		//Non modifiable object
		String s = "Jai"+"Hind";//Only One String in the String Pool "JaiHind"
		
		s.intern();//This will force s to be stored in the StringPool
		String s4 = "JaiHind";//Compiler Optimizes line19 and saves memory at runtime by not creating seperate Jai and Hind Objects
		System.out.println(s==s4);
		//s is not a String literal so not stored on StringPool
		//but s4 is a String literal and hence stored on StringPool
		
		
		

	}

}
