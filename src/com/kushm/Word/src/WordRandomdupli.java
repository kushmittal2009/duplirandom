package com.kushm.Word.src;

import java.util.*;

public  class WordRandomdupli {
	Scanner scanner = new Scanner(System.in);
public static void ifi(){
	Scanner scanner = new Scanner(System.in);
	ArrayList<String> wordlist = new ArrayList<String>();
int num;
String b;

	int words;
	System.out.println("Credits Kush Mittal");
	System.out.println("How many words do you want to write ?");
	num = scanner.nextInt();
	System.out.println("What do you want to seprate the words or phrases? *Default is ','");
	b = scanner.next();
	char c = b.charAt(0); 
	Scanner scanneradd = new Scanner(System.in);

	for(int a=1;a<=num;a++) {
		System.out.println("Next word");

wordlist.add(scanneradd.nextLine());
	}
	
System.out.println("How many words do you want?");
words = scanner.nextInt();
scanner.close();
scanneradd.close();
ArrayList<String> list = new ArrayList<String>();
Object[] wordlists = wordlist.toArray();
for(int i=1;i<words;i++) {
	 int z= (int) ((Math.random() * (num - 0)) + 0);
list.add((String) wordlists[z]);
	 }


String word = list.toString();
word = word.substring(1, word.length() -1);
word = word.replace(',', c);
System.out.println(word);
}


}

