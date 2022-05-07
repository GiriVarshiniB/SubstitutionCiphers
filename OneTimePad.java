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
return new String[] {pt, key, ct};
    }
     static String[] encrypt(String pt){

String key="";
String ct="";
pt=pt.toLowerCase();
Random rg=new Random();
for(int i=0;i<pt.length();i++)
			{
	int r=rg.nextInt(26);
	key=key+ALPHA.charAt(r);
			}

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
return decrypt(ct,key);
}
     }