
/**
 * Write a description of class as here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GoKart
{
        private String name;  //customer name
	private String typeOfCar; //couple or single seat
	private String strokeEngine; //200cc or 150cc
	private  int option; 	//1- quick experience
						//2- race adventure
	private int numberOfLaps; 
	private boolean safetySet;//true if choose safety set

        public GoKart(String name, String type,String stroke,int option,int numLap,boolean safetySet)
        {
            this.name = name;
            this.typeOfCar = type;
            this.strokeEngine = stroke;
            this.option = option;
            this.numberOfLaps = numLap;
            this.safetySet = safetySet;
        }
        
        public String getName() { return name; }
        public String getType() { return typeOfCar; }
        public String getEngineStroke() { return strokeEngine; }
        public int getOption() { return option; }
        public int getNumLaps() { return numberOfLaps; }
        public boolean getSafetySet() { return safetySet; }
        
        public String toString()
        { 
            return "\nName: " +name+ "\nType of Car: " +typeOfCar+ "\nStroke Engine: " +strokeEngine+ "\nOption: "
            +option+ "\nNumber of Laps: " +numberOfLaps+ "\nSafety Set: " +safetySet; 
        }
}
