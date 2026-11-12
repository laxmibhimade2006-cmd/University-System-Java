class Person{
    String name = "Vaishnavi";
    int id = 348;

    void displayInfo(){
        System.out.println("Name" + name);
        System.out.println("ID" + id);
    }
}
class Student extends Person{
    String branch = "AI&DS";
    int semester = 7;
    int marks = 70 + 88 + 80 + 73 + 87;
    
    void calculatePercentage(){
        double percentage = (marks / 500.0)*100;
        System.out.println("Percentage: " + percentage);

    }

    void displayStudentInfo(){
        System.out.println("Branch" + branch);
        System.out.println("Semester" + semester);
        System.out.println("Marks" + marks);
    }
}

class Employee extends Person{
    double basicSalary = 80000 ;
    
    void calculateSalary(){
        double hra = 0.1 * basicSalary;
        double da = 0.2 * basicSalary;
        double salary = basicSalary + hra + da;
        System.out.println("Salary: " + salary);
    }

    
}
class Professor extends Employee{
    String subject = "Data Structures";
    double researchAllowance = 1200;
    double newsalary = basicSalary + researchAllowance;

    void calculateNewSalary(){
        System.out.println("New Salary: " + newsalary);
        
    }

    
}
class Staff extends Employee{
    String department = "Administration";
    int overtimeHours = 2;
    double staffSalary = basicSalary + (overtimeHours * 500);

    void calculateStaffSalary(){
        System.out.println("Staff Salary: " + staffSalary);
        
    }
}
public class UniversitySystem{
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();
        s.displayStudentInfo();
        s.calculatePercentage();

        Professor p = new Professor();
        p.displayInfo();
        p.calculateSalary();
        p.calculateNewSalary();

        Staff st = new Staff();
        st.displayInfo();
        st.calculateSalary();
        st.calculateStaffSalary();
    }
}