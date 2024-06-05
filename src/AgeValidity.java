import javax.swing.*;

public class AgeValidity {

    public static void main(String[] args) {

       int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual sua idade? "));
       if (age < 18) {
           System.out.println("Idade não valida.");
       }
       if (age >= 18) {
           System.out.println("Idade valida.");
       }
    }
}
