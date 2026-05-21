//File : Day100Ps.java
//Day1-OOPs Basics for SDET

class Student {
  String name;
  int rollno;
  String course;

//constructor
Student(String studentName, int studentRollNo , String studentCourse)
  {
    name = studentName;
    rollno = studentRollNo;
    course = studentCourse;
  }
//Method-Action/Behavior
  void displayDetails()
  {
    System.out.println("------------Student Details--------");
    System.out.println("Name:" +name);
    System.out.println("Roll No:"+ rollno);
    System.out.println("Course:"+course);
    System.out.println("-------------------");
   // ---Method-SDET validations

    void checkCourseEligibility(){
      if(course.equals("SDET")){
        System.out.println(name+" is eligible for Automation Training!");
      }else{
        System.out.println(name + "needs to enroll in SDET Course.");
      }
    }
  }

  public class Day100Ps{
    public static void main (String [] args){
      Student student1 = new Student("Kavitha",8,"SDET");
      Studnet student2 = new Student("Lakshmi",23,"CA");


      Student1.displayDetails();
      Studnet1.checkCourseEligibility();
      System.out.println();
      Student2.displayDetails();
      Studnet2.checkCourseEligibility();
    }
  }




