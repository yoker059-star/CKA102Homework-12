package hw1;

public class Hw1031part2 {
	public static void main(String[] args) {
		int seconds=256559, mins= seconds/60,hours=mins/60,days=hours/24;
		System.out.println(days+"天"+hours+"小時");
		System.out.println(mins+"分"+seconds%60+"秒");
		System.out.println(days+"天"+hours%24+"小時"+mins%60+"分"+seconds%60+"秒");
		
		
	}

}
