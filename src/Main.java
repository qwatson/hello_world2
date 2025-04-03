import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello world and " + name + "!");

        int age = Integer.parseInt(JOptionPane.showInputDialog("How many years old are you?"));
        String food = JOptionPane.showInputDialog("What is your favorite food?");

        JOptionPane.showMessageDialog(null, "Your name is " + name + ".\nYou are " + age + " years old.\n" + "Your favorite food is " + food + "." );
        JOptionPane.showMessageDialog(null, "It is nice to meet you " + name + "!");
    }
}