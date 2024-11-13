import javax.persistence.Table;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity

@Table(name="student")

 

public class Student {

       @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="student_id")

    int studentId;

   

    @Column(name="student_name")

    String studentName;

   

    @Column(name="student_age")

    int studentAge;

    public Student() {}

    public Student(int studentId, String studentName, int studentAge) {

        super();

        this.studentId = studentId;

        this.studentName = studentName;

        this.studentAge = studentAge;

    }
    public int getStudentId() {

        return studentId;

    }

    public void setStudentId(int studentId) {

        this.studentId = studentId;

    }

   

    

    public String getStudentName() {

        return studentName;

    }

    public void setStudentName(String studentName) {

        this.studentName = studentName;

    }

    public int getStudentAge() {

        return studentAge;

    }

    public void setStudentAge(int studentAge) {

        this.studentAge = studentAge;

    }

    @Override

    public String toString() {

        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";

    }

}