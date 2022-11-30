	
import java.util.Scanner;
public class WordReverse {
	

 

    public static string reverseTheSentence(string s)
    {
        string[] s1 = s.split("\\s");
         
        string outputString = "";
         
        for (int i = words.length-1; i >= 0; i--)
        {
            outputString = outputString + words[i] + " ";
        }
         
        return outputString;
    }
     
    public static void main(string[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter Input String :");
         
        string s = sc.nextLine();


         
        System.out.println("Input String : "+reverseTheSentence(s));
         
        System.out.println("Output String : "+reverseTheSentence(s));
         
        sc.close();
    }


	

}