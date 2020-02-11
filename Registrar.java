// ==============================================
// 
// Student Registrar program to calculate
// graduation date using the GregorianCalendar 
// format. 
// 
// ==============================================

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Registrar {

    static class CollegeStudent {

        private String fName;
        private String lName;
        private GregorianCalendar enrDate = new GregorianCalendar();
        private GregorianCalendar gradDate = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd yyyy");

        public CollegeStudent(String firstName, String lastName, GregorianCalendar enrollDate) {
            fName = firstName;
            lName = lastName;
            enrDate = enrollDate;
            setGradDate(enrDate);
        }

        public void setFirstName(String newVal) {
            fName = newVal;
        }

        public String getFirstName() {
            return fName;
        }

        public void setLastName(String newVal) {
            lName = newVal;
        }

        public String getLastName() {
            return lName;
        }

        public void setEnrollDate(GregorianCalendar newVal) {
            enrDate = newVal;
        }

        public String getEnrollDate() {
            Date date = enrDate.getTime();
            return sdf.format(date);
        }

        public void setGradDate(GregorianCalendar newVal) {
            gradDate = (GregorianCalendar) enrDate.clone();
            gradDate.add(GregorianCalendar.YEAR, 4);
        }

        public String getGradDate() {
            Date date = gradDate.getTime();
            return sdf.format(date);
        }
    }

    public static void main(String[] args) {
        String fName;
        String lName;
        String input;
        int month;
        int day;
        int year;
        String fName2;
        String lName2;
        String input2;
        int month2;
        int day2;
        int year2;
        GregorianCalendar enrDate = new GregorianCalendar();
        GregorianCalendar enrDate2 = new GregorianCalendar();

        fName = JOptionPane.showInputDialog("Please enter a first name for student one: ");
        lName = JOptionPane.showInputDialog("Please enter a last name for student one: ");
        input = JOptionPane.showInputDialog("Please enter an enroll Month for student one (0-11): ");
        month = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Please enter an enroll Day for student one: ");
        day = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Please enter an enroll Year for student one: ");
        year = Integer.parseInt(input);

        enrDate.set(GregorianCalendar.MONTH, month);
        enrDate.set(GregorianCalendar.DAY_OF_MONTH, day);
        enrDate.set(GregorianCalendar.YEAR, year);

        CollegeStudent student1 = new CollegeStudent(fName, lName, enrDate);

        fName2 = JOptionPane.showInputDialog("Please enter a first name for student two: ");
        lName2 = JOptionPane.showInputDialog("Please enter a last name for student two: ");
        input2 = JOptionPane.showInputDialog("Please enter an enroll Month for student two (0-11): ");
        month2 = Integer.parseInt(input2);
        input2 = JOptionPane.showInputDialog("Please enter an enroll Day for student two: ");
        day2 = Integer.parseInt(input2);
        input2 = JOptionPane.showInputDialog("Please enter an enroll Year for student two: ");
        year2 = Integer.parseInt(input2);

        enrDate2.set(GregorianCalendar.MONTH, month2);
        enrDate2.set(GregorianCalendar.DAY_OF_MONTH, day2);
        enrDate2.set(GregorianCalendar.YEAR, year2);

        CollegeStudent student2 = new CollegeStudent(fName2, lName2, enrDate2);

        JOptionPane.showMessageDialog(null, 
            "===== INFORMATION FOR STUDENT 1 =====\n" + 
            "STUDENT NAME: " + student1.getFirstName() + " " + student1.getLastName() + 
            "\nENROLLMENT DATE: " + student1.getEnrollDate() +
            "\nGRADUATION DATE: " + student1.getGradDate()
        );
   
        JOptionPane.showMessageDialog(null, 
            "===== INFORMATION FOR STUDENT 2 =====\n" + 
            "STUDENT NAME: " + student2.getFirstName() + " " + student2.getLastName() + 
            "\nENROLLMENT DATE: " + student2.getEnrollDate() +
            "\nGRADUATION DATE: " + student2.getGradDate()
        );
    }
}