public class TestGradeBook {
  public static void main(String[] args) {
    GradeBook gradebook1 = new GradeBook("Maths", 5);
    GradeBook gradebook2 = new GradeBook("English", 3);
    gradebook1.addStudentResult("Doc", 1, 23.30);
    gradebook1.addStudentResult("Doc", 2, 12.46);
    gradebook1.addStudentResult("Doc", 3, 32.77);
    gradebook1.addStudentResult("Doc", 4, 99.24);
    gradebook1.addStudentResult("Doc", 5, 87.50);

    gradebook2.addStudentResult("Joe", 1, 91.82);
    gradebook2.addStudentResult("Joe", 2, 67.76);
    gradebook2.addStudentResult("Joe", 3, 32.78);


    System.out.println(gradebook1.toString() + gradebook2.toString());

  }
}
