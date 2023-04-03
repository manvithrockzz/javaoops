package Encapsulation_Code;

public class Student {

     int rollNumber;
     String name;
    private boolean isAttended;

    public Student(int rollNumber){
        this.rollNumber = rollNumber;
    }

    
    public void setStudnetAttendence(boolean flag) {

        if(!isAttended)
        isAttended=flag;
        System.out.println("Teacher assigned attendence to student");
    }

    public boolean getStudentAttendence(){
        System.out.println("Teacher accessed stuent data");
        return isAttended;
    
    }

    
}
