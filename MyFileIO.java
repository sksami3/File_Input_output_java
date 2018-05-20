import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class MyFileIO 
{
    
	public static int alphabets, vowels, consonant, word, i,sen,line;
	
	public static void main(String []args) throws Exception
	{
		
		
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		String s="";
		String temp; 
		char choice = 'y';
		
		File file = new File("input.txt");
		  
		file.createNewFile();
		
		FileWriter writer = new FileWriter(file); 
		 
		line=0;
		 
		while(choice=='y')
		{
			temp = bfr.readLine();
			s=s+temp+"\r"+"\n";
			System.out.println("More? y for yes and n for no");
			choice=sc.next().charAt(0); 
			line++;
			//System.out.println("line: "+line);
		}
		writer.write(s); 
		writer.flush();
		writer.close();
	 
	 
		
		String t2; 
		//File file = new File("input.txt");
		FileReader reader = new FileReader(file);
		BufferedReader bfl = new BufferedReader(reader);
		
		String a="";
		while((t2=bfl.readLine())!=null)
		{
			a=a+t2+"\n"+"\r";
		}
		
		
		System.out.print(a);
	char[] str=new char[9999999];	
	alphabets = vowels = consonant = sen = i = 0;
	word=-1;
	try{
	str=s.toCharArray();  
    
    while(str[i]!='\0')
    {
        if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
        {
            alphabets++;
			if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i]== 'o' || str[i] == 'u' || str[i] =='A' || str[i] =='E' || str[i] =='I' || str[i] =='O' || str[i] =='U')
				{
					vowels++;
					
				}
			
			
			else 
				{
            
					consonant++;
				}
			
			
				
			
			
			
        }
		if (((i>0)&&(str[i]!=' ')&&(str[i-1]==' ')) || ((str[0]!=' ')&&(i==0)) || ((i>0)&&(str[i]=='.')&&(str[i+1]!=' ')&&(str[i-1]!=' ')))
				{
					word++;
					
				}
		if (str[i] == '.' || str[i] == '?' || str[i] == '!')
				{
					sen++;
					
				}
    			
		
		
		
    
		i++;
		
		
    }
	
	}
	 catch(Exception e) {
		        System.out.println("Error during reading/writing");
		   }  
		
	 
	finally
	{
		System.out.println();
		System.out.println();
		System.out.println("----------------Alphabetical Statistics----------------------");
		System.out.println("alphabets: "+alphabets);
		System.out.println("vowels: "+vowels);
		System.out.println("consonant: "+consonant);
		System.out.println("word: "+word);
		System.out.println("sentences: "+sen);	
		System.out.println("lines: "+line); 
		
		String stri= "alphabets: " +Integer.toString(alphabets)+System.lineSeparator()+"vowels: "+Integer.toString(vowels)+System.lineSeparator()+"consonant: "+Integer.toString(consonant)+System.lineSeparator()+"words: "+Integer.toString(word)+System.lineSeparator()+"sentence: "+Integer.toString(sen)+System.lineSeparator()+"lines: "+Integer.toString(line);
		try {
		      
		      String line = stri;			  
			  File of = new File("output.txt");		  
			  file.createNewFile();
		      PrintWriter output = new PrintWriter(of);		      
		      output.println(line);

		      output.close();
		   }
		      catch(Exception e1) {
		        System.out.println();
		   }
		
	}		
		reader.close();
	}
	

    
		
}
	
