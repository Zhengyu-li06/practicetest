package jp.co.aforce.test.Practice7and8;
import java.util.List;
import java.util.Random;


import java.util.ArrayList;

public class PracticeTest8 {

	private int n;
	private Random random = new Random();

	public static void main(String[] args) {
		
		
		
		PracticeTest8 practice = new PracticeTest8();
        practice.printHello();
        
        PracticeTest8 practice2 = new PracticeTest8();
        practice2.printRandomMessage();
        
        PracticeTest8 practice3 = new PracticeTest8();
        practice3.printMessage();
        
        PracticeTest8 practice4 = new PracticeTest8();
        practice4.printRectangleArea();
        
        PracticeTest8 practice6 = new PracticeTest8();
        practice6.printWeatherForecast();
        System.out.println(practice.printWeatherForecast());
        
        PracticeTest8 practice7 = new PracticeTest8();
        practice7.isEvenNumber();
        System.out.println(practice.isEvenNumber());
        
        PracticeTest8 practice8 = new PracticeTest8();
        practice8.getMessage();
        
        PracticeTest8 practice9 = new PracticeTest8();
        practice9.getLongString();
        System.out.println(practice.getLongString());
        
        PracticeTest8 practice10 = new PracticeTest8();
        
        Person person1 = new Person("小平", 25);
        System.out.println(person1.getName() + "は成人です。");

        
        Person person2 = new Person("佐藤", 18);
        System.out.println(person2.getName() + "は成人ではないです。");
	}
	
	
	
		//練習問題１
		public void printHello() {
			
			System.out.print("Hello");
			System.out.println();
		
		}
		

		
		//練習問題2
				public void printRandomMessage() {
					
					 int n = (int)(3 * Math.random());
				        
					
							if (n == 1) {
								System.out.print("こんばんは" );
							}else if(n == 2) {System.out.print("こんにちは" );
				}else{
					System.out.print("おはよう" );
					
				}
					System.out.println();}
							
		 //練習問題3/4
				public void printMessage() {
					
					String message="Hello";
					int count = 5;
					
					 for (int i=1; i>0 && i<5; i++) {
						 System.out.print(message );
						 System.out.println();}
					 }
		//練習問題5		
					
				public void printRectangleArea(){
					 double height = 1.6;
				     double width = 2.88;
				     
				     System.out.println(height*width);
					 
					 
				}

		//練習問題6
				

				public String printWeatherForecast() {
			        String weatherForecast = "";

			        String[] dates = {"今日", "明日", "明後日"};
			        String[] weather = {"晴れ", "曇り", "雨", "雪"};

			        StringBuilder forecast = new StringBuilder();
			        for (int x = 0; x < dates.length; x++) {
			            String Weather = weather[random.nextInt(weather.length)];
			            forecast.append(dates[x]).append("の天気は").append(Weather);
			            if (x < dates.length - 1) {
			                forecast.append("、");
			            }
			        }
			        forecast.append("でしょう。");

			        weatherForecast = forecast.toString();
			        return weatherForecast;
			      
			    }
				
				//練習問題7
				public boolean isEvenNumber() {
					
					
					int value = (int)(100 * Math.random());
					return value % 2 == 0;
					
				
					 }
					
				//練習問題8
				
				
				private boolean[] isKid = new boolean[2];	
				
				public String getMessage() {
					String name= randomName();
	
					
					if(isEven(name.length())) {
						System.out.println("こんにちは、"+ name +"ちゃん。");
					}else {
						System.out.println("こんにちは、"+ name +"さん。");
					}
					
					return name;
					
				}
				
				private boolean isEven(int number) {
			        return number % 2 == 0;
			    }
				private String randomName() {
					String names[]= {"Zelda","Maya","Lilian","Williams"
				};
					Random random = new Random();
					int index = random.nextInt(names.length);
					return names[index];
			    
				
				
					
					
}
               //練習問題9
               public String getLongString() {
               	   
               String[] Array = {"青空","海","桜","雪","紅葉","白い雪","コンサート","音楽","島","地図","歌"};
	            	  
			   
			   List<String> longestWords = new ArrayList<>();
		       int maxLength = 0;
		       
			   for (String word:Array) {
				   int length = word.length();
				   if (length > maxLength) {
		                longestWords.clear();
		                maxLength = length;
		            }
		            if (length >= maxLength) {
		                longestWords.add(word);
		            }
		        }
		        
			   
			   return longestWords.get(longestWords.size() - 1);
				
               }}
				
                //練習問題10

                 class Person {
                 private String name;
                 private int age;
    
                 Person(String name, int age) {
                 this.name = name;
                 this.age = age;
                 }
    
                 String getName() {
                 return name;
                 }
    
                 int getAge() {
                 return age;
                 }
    
                 
                 public boolean isAdult (){
                	 
                	 return age>=20;
                 }
                 
                 
                 }
     	
     			    