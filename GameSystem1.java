package com.Typesof_Interfaces;
import java.io.*;

class Player implements Serializable {
	String name;
	transient int level;
	Player (String name, int level) {
		this.name = name;
		this.level = level;
	}
}

interface LevelUp {
	int doubleexp(int currentLevel);
}

interface Gamework {
	void attack();
	void heal();
}


public class GameSystem1 implements Gamework
{
	@Override
	public void attack() {
		System.out.println("Player attacking");
	}
	
	@Override
	public void heal() {
		System.out.println("Player Healing.");
	}
	
	public static void main(String[] args) {
		
		LevelUp upped = (lvl) -> lvl * 2;
		Player p1 = new Player("Hero_Zero", 5);
		p1.level = upped.doubleexp(p1.level);
		System.out.println(p1.level + " upgraded to level: " + p1.name);
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("savegame.txt"));
			out.writeObject(p1);
			out.close();
			System.out.println("Game Saved Successfully.");
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("savegame.txt"));
			Player savedPlayer = (Player) in.readObject();
			System.out.println("Loaded Player: " + savedPlayer.name + " at level " + savedPlayer.level);
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}









