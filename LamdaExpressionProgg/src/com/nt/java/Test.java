package com.nt.java;

public class Test {
	
	public static void main(String[] args) {
		Game fb=new Game()
				{
			public void play()
			{
				System.out.println("play foot ball");
			}
			
				};

	}
	interface Game
	{
		public void play();
	}


}
