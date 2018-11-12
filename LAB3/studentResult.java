public class studentResult
{ String studentID;
  private testResult result; 
public studentResult(string studentID)
{
 this.studentID = studentID;
}	

public studentResult(string studentID,int numOfTests)
{
 this.studentID = studentID;
 result = new testResult(numOfTests);
}	
public String getStudentId()
{
	return studentID;
}
public void addResult(int testId, double value)
{
	results.setScore(testId,value);
}
public String toString()
{ String all = "";
  all = (all+result.toString());
  return all;
	
	
}
}
