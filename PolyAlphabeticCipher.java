import java.util.Scanner;

public class PolyAlphabeticCipher {
       
    static String decrypt(String ct,String key){
String pt="";
//System.out.println("encrypted message="+ct);
String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
int ctlen=ct.length();
int keylen=key.length();
if(ctlen<keylen)
{
	int diff=keylen-ctlen;
	for(int i=0;i<diff;i++)
	{
		ct+=ct.charAt(i);
	}
}
if(ctlen>keylen)
{
	int diff=ctlen-keylen;
	for(int i=0;i<diff;i++)
	{
		key+=key.charAt(i);
	}
}

for (int i = 0; i < ct.length(); i++)
{	if ( ct.charAt(i) == ' ') {
	   pt += ' ';
	}
	else {
	int kpos = ALPHABET.indexOf(key.charAt(i));
	int ctpos = ALPHABET.indexOf(ct.charAt(i));
	int ptpos = ( ctpos - kpos + 26)%26;
	pt += ALPHABET.charAt(ptpos);
	}
}
return pt;
//System.out.println("decrypted message="+pt);
    }
        
    static String encrypt(String pt, String key)
    {

String ct="";
String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
int ptlen=pt.length();
int keylen=key.length();
if(ptlen<keylen)
{
	int diff=keylen-ptlen;
	for(int i=0;i<diff;i++)
	{
		pt+=pt.charAt(i);
	}
}
if(ptlen>keylen)
{
	int diff=ptlen-keylen;
	for(int i=0;i<diff;i++)
	{
		key+=key.charAt(i);
	}
}
ptlen=pt.length();
for (int i = 0; i < ptlen ; i++)
{	if ( pt.charAt(i) == ' ') {
	   ct += ' ';
	}
	else {
	int kpos = ALPHABET.indexOf(key.charAt(i));
	int ptpos = ALPHABET.indexOf(pt.charAt(i));
	int cpos = (kpos + ptpos )%26;
	ct += ALPHABET.charAt(cpos);
	}
}
//System.out.println("This is key"+key);
   //decrypt(ct,key);
return ct;
    }
    /*
    public static void main(String[] args) {
        polyalpha pa = new polyalpha();
        System.out.println("Enter Plantext : ");
        Scanner sc = new Scanner(System.in);     
   String pt=sc.nextLine();
   System.out.println("Enter Key : ");
   String key=sc.nextLine();
        String en = pa.encrypt(pt,key);
        System.out.println("Encrypted: "+en);
        String de = pa.decrypt(en, key);
        System.out.println("Decrypted: "+de);
   
    }       */
}