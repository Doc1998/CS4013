public class GradeBook
{ private String name;
  private int numOfTests;
  ArrayList<studentResult> student = new ArrayList<>;

public GradeBook(String name,int numOfTests)
{
	this.name = name;
	this.numOfTests = numOfTests;
	
	
}
public void addStudentResult(String id, int testId,double value)
{
	 boolean exists = false;
    for (int i=0; i<student.size(); i++) {
      if (students.get(i).getStudentID().matches(id)) {
        exists = true;
      }
    }
    if (!exists) {
      StudentResult student = new StudentResult(id,numOfTests);
      student.add(student);
    }
    for (int i=0; i<student.size(); i++) {
      if (student.get(i).getStudentID().matches(id)) {
        student.get(i).addResult(testID, value);
      }
    }
  }
	
}
  public String toString() {
    String x ="";
    for (int i=0; i<student.size(); i++) {
      x = (x+student.get(i).getStudentID()+","+student.get(i).toString()+"\n");
    }
    return x;
  }
}
}