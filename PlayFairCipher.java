public class PlayFairCipher {
private static String KeyWord=new String();
private static String Key=new String();
private static char matrix_arr[][]= new char[5][5];

public static void setKey(String k)
{

String K_adjust=new String();
boolean flag = false;

K_adjust = K_adjust + k.charAt(0);

for(int i=1; i<k.length();i++)
{
for(int j=0;j<K_adjust.length(); j++)
{
if(k.charAt(i)==K_adjust.charAt(j))
{
flag = true;
}
}

if(flag == false)
K_adjust = K_adjust + k.charAt(i);

flag = false;
}

KeyWord=K_adjust;
}

public static void KeyGen()
{

    Key=KeyWord;
    for(int i=0;i<26;i++)
    {
        if(i==9) continue;
        char p = (char)('a'+i);
      if(Key.indexOf(p)<0) Key=Key+p;
    }
matrix ();
}

private static void matrix ()
{
int k=0;

for (int i=0 ; i<5 ;i++)
{
for (int j=0 ; j<5 ; j++)
{
matrix_arr[i][j]=Key.charAt(k);
System.out.printf("%s ",matrix_arr[i][j]);
k++;
}
System.out.println("\n");
}
}

private static String format(String old_text)
{

int i = 0;
int j = 0;
int len = 0;
String text = new String();
len = old_text.length();
text=old_text;
text=text.replace('j', 'i');
len = text.length();
for (i = 0; i < len-1; i = i + 2) 
{
if (text.charAt(i+1) == text.charAt(i)) 

 text = text.substring(0, i+1) + 'x' + text.substring(i+1);
}
return text;
}

private static String [] Divid2Pairs (String new_string)
{
String Original = format(new_string);

int size= Original.length();

if(size%2!=0)
{
size++;
Original = Original+'x';
}

String x[]= new String[size/2];

int counter=0;

for ( int i=0 ; i<size/2 ;i++)
{
x[i]=Original.substring(counter, counter+2);
counter=counter+2;
}

return x;
}

public static int[] GetDiminsions(char letter)
{
int []key=new int[2];

if ( letter == 'j')
letter='i';

for (int i=0 ; i<5 ;i++)
{
for (int j=0 ; j<5 ; j++)
{
if(matrix_arr[i][j] == letter)
{
key[0]=i;
key[1]=j;
break;
}
}

}
return key;
}

public static String Encrypt(String Source)
{

String src_arr[]=Divid2Pairs(Source);
String Code=new String();
char one;
char two;
int part1[]=new int[2];
int part2[]=new int[2];

for (int i=0 ; i< src_arr.length ;i++ )
{
one = src_arr[i].charAt(0);
two = src_arr[i].charAt(1);

part1 = GetDiminsions(one);
part2 = GetDiminsions(two);

if(part1[0]==part2[0])
{
if (part1[1]<4)
part1[1]++;
else
part1[1]=0;

if(part2[1]<4)
part2[1]++;
else
part2[1]=0;

}

else if (part1[1]==part2[1])
{
if (part1[0]<4)
part1[0]++;
else
part1[0]=0;

if(part2[0]<4)
part2[0]++;
else
part2[0]=0;
}
else
{
int temp=part1[1];
part1[1]=part2[1];
part2[1]=temp;
}

Code= Code + matrix_arr[part1[0]][part1[1]] + matrix_arr[part2[0]][part2[1]];
}
return Code;
}

public static String Decrypt (String Code)
{

String Original=new String();

String src_arr[]=Divid2Pairs(Code);

char one;
char two;

int part1[]=new int[2];
int part2[]=new int[2];

for (int i=0 ; i< src_arr.length ;i++ )
{
one = src_arr[i].charAt(0);
two = src_arr[i].charAt(1);

part1 = GetDiminsions(one);
part2 = GetDiminsions(two);

if(part1[0]==part2[0])
{
if (part1[1]>0)
part1[1]--;
else
part1[1]=4;

if(part2[1]>0)
part2[1]--;
else
part2[1]=4;
}

else if (part1[1]==part2[1]) 
{
if (part1[0]>0)
part1[0]--;
else
part1[0]=4;

if(part2[0]>0)
part2[0]--;
else
part2[0]=4;
}
else
{
int temp=part1[1];
part1[1]=part2[1];
part2[1]=temp;
}
Original =Original + matrix_arr[part1[0]][part1[1]] + matrix_arr[part2[0]][part2[1]];
}
return Original;
}
}