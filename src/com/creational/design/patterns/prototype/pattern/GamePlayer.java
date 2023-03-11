package com.creational.design.patterns.prototype.pattern;

public class GamePlayer implements Cloneable{
	
	String game;
	String level;
	ModeOfPlaying mod;
	public GamePlayer() {};
	public GamePlayer(String game, String level,ModeOfPlaying mod) {
		this.game= game; 
		this.level= level;
		this.mod = mod;
	}
	@Override
	protected GamePlayer clone() throws CloneNotSupportedException {
		//Shallow clone
		//return (GamePlayer)super.clone();
		//deep clone
		GamePlayer gm =(GamePlayer) super.clone();
		gm.setMod(new ModeOfPlaying());
		return gm;
	}
	@Override
	public String toString() {
		return "GamePlayer [game=" + game + ", level=" + level + ", mod=" + mod.hashCode() + "]";
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public ModeOfPlaying getMod() {
		return mod;
	}
	public void setMod(ModeOfPlaying mod) {
		this.mod = mod;
	}

}
