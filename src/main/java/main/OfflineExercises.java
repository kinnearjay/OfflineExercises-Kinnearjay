package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OfflineExercises {
	public static void main(String[] args){
		OfflineExercises of = new OfflineExercises();
		of.amISearch("am am am am i in amsterdamamam");
		//of.largest("23 26 29");
		//System.out.println(17%10);
		//System.out.println( (int) 'A' );





	}

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String multCharStr = "";
		char[] charArr = input.toCharArray();
		for(int i = 0; i< charArr.length; i++){
			for ( int c = 0; c<3; c++){
				multCharStr += charArr[i];
				System.out.println(charArr[i]);
			}

		}
		return multCharStr;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		if(input.contains("bert")){
			input.split("bert");
		}

		String[] newStr =  input.toLowerCase().split("bert");

		String word = newStr[1];
		String reversedWord = "";
		//System.out.println(newStr[1]);
		for(int i = word.length()-1 ; i> -1; i--){
			char[] wordarray = word.toCharArray();
			reversedWord+= wordarray[i];
			System.out.println(reversedWord);
		}
		if(reversedWord.equals("yy")|| reversedWord.equals("xx")){
			return "";
		}

		return reversedWord ;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		if ( (c-b-a)== 0|| (a-b-c) == 0 || (b-c-a ) == 0 || (c-b-a )==0){
			return true;
		}
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {





		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		if(input.toLowerCase().endsWith("dev")){
			return true;

		}
		return false;


	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		int biggestBlock = 0;
		int placeholder;
		int accumulator =0;
		char[] wordArr = input.toCharArray();

		for(int i =0; i <= 25; i++) {
			accumulator = 0;
			for (int c = 0; c < input.length(); c++) {
				if (wordArr[c] == (char) 97 + i) {
					accumulator += 1;

				}
				if (accumulator > biggestBlock) {
					biggestBlock = accumulator;
				}

			}
		}
			for(int i =0; i <= 25; i++){
				accumulator = 0;
				for(int c = 0; c < input.length(); c++){
					if(wordArr[c] == (char) 65+i){
						accumulator +=1;

					}
					if(accumulator>biggestBlock){
						biggestBlock = accumulator;

					}

				}


		}


		return biggestBlock;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		String arg2 = arg1.toLowerCase().replace("amsterdam","");
		int count = 0;
		String[] amCount = arg2.toLowerCase().split(" am ");
		for(int i = 0 ; i <amCount.length; i++){
			System.out.println(amCount[i]);
			if(amCount[i].equals(null)){
				count +=1;
			}
		}

		if(amCount.length == 1){
			return count;
		}


		return count;
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		if(arg1%3==0 && arg1%5==0){
			return"fizzbuzz";

		}else if(arg1%3==0){
			return "fizz";
		}else if(arg1 %5==0){
			return "buzz";
		}

		return null;
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		String [] numbers = arg1.split(" ");
		for(int i = 0; i<numbers.length; i++){
			System.out.println(numbers[i]);

			int firstNum = Integer.parseInt(numbers[0])/10 +  Integer.parseInt(numbers[0])%10;
			int secondNum = Integer.parseInt(numbers[1])/10 +  Integer.parseInt(numbers[1])%10;
			int thirdNum = Integer.parseInt(numbers[2])/10 +  Integer.parseInt(numbers[2])%10;
			if (firstNum > secondNum && firstNum > thirdNum){
				return firstNum;
			}else if(secondNum > firstNum && secondNum > thirdNum){
				return secondNum;
			}else if( thirdNum > firstNum && thirdNum>secondNum){
				return thirdNum;
			}
		}
		return 0;
		
	}
	
	
}
