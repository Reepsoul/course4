package kursach4;

import hw6.climbers.properties.Climber;
import hw6.climbers.properties.Mountain;
import hw6.climbers.properties.Group;

public class Application {

	public static void main(String[] args) {
		
		Climber climber1 = new Climber("Егор", "Альметьевск");
		Climber climber2 = new Climber("Mike", "Texas");
	    Climber climber3 = new Climber("Alexander", "Saint-Petersburg");
	    Climber climber4 = new Climber("Dave", "Paris");
	    Climber climber5 = new Climber("Duarte", "Maputo");
	    Climber climber6 = new Climber("Robert", "Kazan");
	    
		Group group = new Group(new Mountain("Chogori", "Pakistan", 8611)); 
		
		group.addClimbers(climber2, climber3, climber1);
		
		System.out.println(group);
		
		
	}

}