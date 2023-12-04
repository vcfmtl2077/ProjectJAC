package oop.assignment.projecta;

import oop.assignment.projecta.model.Computer;

public class projectA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer[] comArray = new Computer[6];
		Computer mac1 = new Computer();
		Computer mac2 = new Computer();
		Computer lenovo = new Computer("Lenovo");
		Computer hp = new Computer("HP","7760W");
		Computer dell = new Computer("DELL","3360",198762345);
		Computer h3c = new Computer("H3C","3230",198762345,9000);
		mac1.setSN(987654321);
		System.out.println("Mac1 is: "+mac1);
		System.out.println("Mac2 is: "+mac2);
		System.out.println("Mac1 equlas Mac2: "+mac1.equals(mac2)); 
		
		System.out.println("Lenovo is: "+lenovo);
		System.out.println("HP is: "+hp);
		System.out.println("Lenovo equlas HP: "+lenovo.equals(hp)); 
		
		System.out.println("DELL is: "+dell);
		System.out.println("H3C is: "+h3c);
		
		
		
		System.out.println("findNumberOfCreatedComputers: "+findNumberOfCreatedComputers(comArray));
		
		comArray[0]=mac1;
		comArray[1]=mac2;
		comArray[2]=lenovo;
		comArray[3]=hp;
		comArray[4]=dell;
		comArray[5]=h3c;
		
		System.out.println("findNumberOfCreatedComputers: "+findNumberOfCreatedComputers(comArray));
		
		for(int i=0;i<comArray.length;i++) {
			System.out.println("comArray "+i+" element is: "+comArray[i]);
		}

	}
	
	private static int findNumberOfCreatedComputers(Computer[] array) {
		int result = 0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]!=null) {
				result++;
			}
		}
		return result;
	}

}
