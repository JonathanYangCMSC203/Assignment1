import java.util.Scanner;

public class Windchill {

	public static void main(String[] args) {
		final double NUM1 = 35.74, NUM2 = 0.6215, NUM3 = 35.75, NUM4=0.4275;//declares and initialize variables for windChillForm.
		double tempInFar, windSpeed, windChillForm;//declares variable
		Scanner input = new Scanner(System.in);
		
		System.out.println("Wind Chill Calculator");
		System.out.println("(Choose between -45 and 40)\nEnter the Temperature in Farhenheit: ");//prompts for temperature
		tempInFar = input.nextDouble();//input temperature
		System.out.println("(Choose between 5 and 60)\nEnter the Wind Speed: ");//prompts for windspeed
		windSpeed = input.nextDouble();//input windspeed
		
		if(tempInFar >= -45 && tempInFar <= 40 && windSpeed >= 5 && windSpeed <= 60)//test if temperature and windspeed is valid. 
		{
			windChillForm = NUM1 + NUM2*tempInFar - NUM3*Math.pow(windSpeed, 0.16)+ NUM4*tempInFar*Math.pow(windSpeed, 0.16);//Formula for Wind chill
			System.out.println("Windchill is " + windChillForm + " degrees Fahrenheit.\n\nProgrammer: Jonathan Yang");//outputs Windchill.
		}
		else
			System.out.println("INVALID INPUT");//outputs fail if statement does not work

	}//end main

}//end of program
