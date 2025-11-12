public class Student
{
    private String id;
    private String name;
    private double grades;
    
    public Student()
    {
        id = "";
        name = "";
        grades = 0;
    }
    
    public void setStudID(String id){ this.id = id; }
    public void setStudName(String name){ this.name = name; }
    public void setGrade(double grade) { grades = grade; }
    
    public String getStudID(){ return id; }
    public String getStudName(){ return name; }
    public double getGrade(){ return grades; }
    
}
