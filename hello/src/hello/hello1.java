package hello;

import java.util.Scanner;

public class hello1 {

	public static void main(String[] args) {
		//用swith break 
		//input a int
		Scanner in = new Scanner(System.in);
		int num;
		int numR;
		int numS;
		num = in.nextInt();
		numR = (int) (Math.ceil(num/10)); 
		numS = num - (numR * 10);
 		String opt1;
 		switch (numR) {
		case 1:
			opt1 = "Unreadable";
			break;
		case 2:
			opt1 = "Barely readable, occasional words distinguishable";
			break;
		case 3: 
			opt1 = "Readable with considerable difficulty";
			break;
		case 4: 
			opt1 = "Readable with practically no difficulty";
			break;
		case 5: 
			opt1 = "Perfectly readable";
			break;
		default:
			opt1 = "wrong";	
			break;
	    };
		String opt2;
		switch (numS)
		{
		case 1:
			opt2 = "Faint signals, barely perceptible";
			break;
		case 2: 
			opt2 = "Very weak signals";
			break;
		case 3: opt2 = "Weak signals";
			break;
		case 4: opt2 = "Fair signals";
			break;
		case 5: opt2 = "Fairly good signals";
			break;
		case 6: opt2 = "Good signals";
			break;
		case 7: opt2 = "Moderately strong signals";
			break;
		case 8: opt2 = "Strong signals";
			break;
		case 9: opt2 = "Extremely strong signals";
			break;
		default: opt2 = "wrong";
			break;
		};
		System.out.println(opt2 + ", " + opt1.toLowerCase() + ".");
		}	
	}

