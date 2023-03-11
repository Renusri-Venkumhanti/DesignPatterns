package com.creational.design.patterns.prototype.pattern;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		GamePlayer game1 = new GamePlayer("ludo","1", new ModeOfPlaying());
		GamePlayer game2 = game1.clone();
		System.out.println(game1);
		System.out.println(game2);
		
		
		//shallow copy result GamePlayer [game=ludo, level=1, mod=1531448569]
		//		GamePlayer [game=ludo, level=1, mod=1531448569]
		
		//deep copy results 
		//GamePlayer [game=ludo, level=1, mod=1531448569]
		//GamePlayer [game=ludo, level=1, mod=1867083167]
	}

}
