  

     class StudentInfo{

      String studentName;
      int rollNumber;
      String schoolName;


     void displayInfo(){
        System.out.println(studentName);
        System.out.println(rollNumber);
        System.out.println(schoolName);

      }

public static void main(String[] data){
   StudentInfo m = new StudentInfo();
   m.studentName = "Mahesh";
   m.rollNumber = 23;
   m.schoolName = "skdv";

   m.displayInfo();

  }

    }