package com.nt.java;

public abstract class FootBall implements Game {

	/*@Override
	public void play() {
		System.out.println("play  Xnxx Game");

	}*/

	public static void main(String[] args) {
		/*FootBall fb=new FootBall();
		fb.play();*/
		Game football=new Game()
				{
					public void play()
					{
						System.out.println("play double Xnxx Games ");
					}
				};

	}

}
