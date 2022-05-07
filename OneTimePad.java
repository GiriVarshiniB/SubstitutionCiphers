import java.util.*;

public class OneTimePad {
    
    static String ALPHA="abcdefghijklmnopqrstuvwxyz";
    
    static String[] decrypt(String ct,String key){
      
String pt="";

for(int i=0;i<ct.length();i++)
		 {
	 if (ct.charAt(i) == ' ')
		{
		pt+=' ';
		}
		else {
	int sum=(ct.charAt(i) - key.charAt(i));
        sum=(sum+26)%26;
	
	pt=pt+ALPHA.charAt(sum);
		 }}
		 //System.out.println("Plain text : "+pt);
return new String[] {pt, key, ct};
    }
     static String[] encrypt(String pt){
    
        //Scanner sc=new Scanner(System.in);
    //String pt=sc.nextLine();
String key="";
String ct="";
pt=pt.toLowerCase();
Random rg=new Random();
for(int i=0;i<pt.length();i++)
			{
	int r=rg.nextInt(26);
	key=key+ALPHA.charAt(r);
			}
			//System.out.println("Key is : "+key);

for(int i=0;i<pt.length();i++)
{		
	if (pt.charAt(i) == ' ')
	{
	ct+=' ';
	}
	else {
     int idx=ALPHA.indexOf(pt.charAt(i))+ALPHA.indexOf(key.charAt(i));
     int idx1=idx%26;
     ct=ct+ALPHA.charAt(idx1);
	}
  
}
//System.out.println("Cipher text : "+ct);
return decrypt(ct,key);
//return new String[] {ct,key};
    }
    /*
    public static void main(String[] args) {
        onetimepad otp = new onetimepad();
        System.out.println("Enter input text: ");
        Scanner sc=new Scanner(System.in);
        String pt=sc.nextLine();
        String[] cipher = otp.encrypt(pt);
        //System.out.println(cipher[0]);
        String[] finalname = decrypt(cipher[0],cipher[1]);
        System.out.println(finalname[0]);
        System.out.println(finalname[1]);
        System.out.println(finalname[2]);
    }
    */
}