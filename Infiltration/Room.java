/**
 * CS 141: Intro to Programming and Problem Solving
 * 
 * Final Project
 * 
 * This assignment is final class project involving four team members.
 * In this assignment, students are to create a small, yet interesting,
 * text-based game involving a grid of 81 squares in which the player
 * tries to find a briefcase in 1 of 9 different rooms while avoiding or
 * fighting existing ninjas in the grid. This assignment incorporates
 * all of the knowledge learned throughout the course.
 * 
 * Team Recycle Bin
 * 		<Natanael Ariawan, David Hau, Miguel Menjivar, Aidan Novobilsky>
 */

import java.io.Serializable;

/**
 * The Room object represents a room that the player can search for the briefcase.
 * 
 * @author Natanael Ariawan
 * @author David Hau
 * @author Miguel Menjivar
 * @author Aidan Novobilski
 */
public class Room implements Entity, Serializable {

	/**
	 * This field represents the unique ID used for saving and loading via
	 * serialization.
	 */
	private static final long serialVersionUID = 8900547777889141681L;

	/**
	 * This field represents whether the room contains the briefcase. Set to
	 * {@code false} during constructor and given using {@link #placeBriefcase()}.
	 */
	private boolean hasBriefcase;
	
	/**
	 * This field represents whether or not the player has checked the room. Set to
	 * {@code false} during constructor and {@link #check()}.
	 */
	private boolean checked;
	
	/**
	 * This field represents whether the player can see the briefcase (if it is
	 * contained in this room)
	 */
	private boolean visible;
	
	/**
	 * The default constructor. Sets {@link #hasBriefcase}, {@link #checked}, and
	 * {@link #visible} to {@code false}.
	 */
	public Room(){
		hasBriefcase = false;
		checked = false;
		visible = false;
	}
	
	/**
	 * This method will set the room to be visible (the briefcase will show).
	 */
	public void setVisible(){
		visible = true;
	}
	
	/**
	 * This method will place the briefcase in the room, changing
	 * {@link #hasBriefcase} to {@code true}.
	 */
	public void placeBriefcase(){
		hasBriefcase = true;
	}
	
	/**
	 * This method will return whether or not the room contains the briefcase.
	 * 
	 * @return {@code true} if it has the briefcase, {@code false} otherwise
	 */
	public boolean getHasBriefcase(){
		return hasBriefcase;
	}
	
	/**
	 * This method will return whether the room has been checked or not.
	 * 
	 * @return {@code true} if the room has been checked, {@code false} otherwise
	 */
	public boolean getChecked(){
		return checked;
	}
	
	/**
	 * This method signifies that the room has been checked, and sets
	 * {@link #checked} to {@code true}.
	 */
	public void check(){
		checked = true;
	}
	
	/* (non-Javadoc)
	 * @see edu.cpp.cs.cs141.classproject.Entity#getEntityType()
	 */
	public entityType getEntityType() {
		return Entity.entityType.ROOM;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		if(visible && hasBriefcase)
			return "B";
		else if(checked)
			return "X";
		return "R";
	}

}
