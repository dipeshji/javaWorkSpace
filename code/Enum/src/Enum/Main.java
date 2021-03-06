package Enum;

public class Main {
	enum Player{
		DHONI(100),VIRAT,ROHIT(200),DHAWAN;
		
		int score;
		
		Player(){
			this.score = 0;
		}
		
		Player(int score){
			this.score = score;
		}
		
		public int getScore() {
			return score;
		}
		
	}
	
	
	public static void main(String[] args) {
		EnumClass.Season[] itr = EnumClass.Season.values();
		
		for(EnumClass.Season season: itr) {
			System.out.println(season);
		}
		
		System.out.println("Value of WINTER: " + EnumClass.Season.valueOf("WINTER"));
		System.out.println("Value of FALL: " + EnumClass.Season.valueOf("FALL"));
		
		System.out.println("Index of " + Player.valueOf("VIRAT") + ":" +Player.valueOf("VIRAT").ordinal());
		System.out.println("Index of " + Player.valueOf("DHAWAN") + ":" +Player.valueOf("DHAWAN").ordinal());
		
//		++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
//		Player pl =new Player(); 
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+                                                   +");
		System.out.println("+ Player pl = new Player();                         +");
		System.out.println("+ This will throw compile time error, because enum  +");
		System.out.println("+ has private constructors only                     +");
		System.out.println("+                                                   +");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		Player plD = Player.DHONI;
		
		System.out.println(plD.getScore());
		
		Player plR = Player.ROHIT;
		
		System.out.println(plR.getScore());
		
		Player plDh = Player.DHAWAN;
		
		System.out.println(plDh.getScore());
		
//		===========Switch case===================================
		
		Player pl = Player.DHONI;
		
		switch(pl.score) {
		case 100:
			System.out.println("Player Score: " + pl.score);
			break;
		case 200:
			System.out.println("Player Score: " + pl.score);
			break;
		default:
			System.out.println("No Score");
		}
		
	}
}
