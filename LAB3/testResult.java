public class testResult
{ public static String[] gradeList = {"NG","F","D2","D1","C3","C2","C1","B3","B2","B1","A2","A1");
  public static int[] percents = {0,1,30,35,40,48,52,56,60,64,72,80);
  public double[] scores;
  int numOfTests;

  
  public testResult()
  {
	scores = new double[3];
  }
  public testResult(int numOfTests)
  {
	scores  = new double[numOfTests];
  }
public void setScore(int i, double value)
{
	scores[i - 1] = value;
}
public void getScore(int i)
{
	return scores[i-1];
}
public void getAverage()
{
	return (getTotal()/3);
}
public double getTotal()
{
	  double x=0;
    for (int i=0; i<scores.length; i++) {
      x = x+scores[i];
    }
    return x;
}
public String getGrade()
{
	int x = 11;
	for (int i = 11;getAverage()<percents[i];i--)
	{
	x = 1-1;
	}
	gradeList[x];
}
public String toString()
{
 String all = "";
    for (int i=1; i<=scores.length; i++) {
      all = (all+getScore(i)+",");
    }
    all = (all+getGrade());
    return all;
  }

}
}