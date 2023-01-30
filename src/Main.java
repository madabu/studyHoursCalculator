import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double numberOfSleepingHours;
        double numberOfWorkingHours;
        double numberOfRelaxingHours;
        double numberOfWeekendRelaxingHours;

        String numberOfSleepingHoursStr;
        numberOfSleepingHoursStr = JOptionPane.showInputDialog("How many hours do you usually sleep \n" +
                "every night?");

        String numberOfWorkingHoursStr;
        numberOfWorkingHoursStr = JOptionPane.showInputDialog("How many hours do you usually work \n" +
                "every week day?");

        String numberOfRelaxingHoursStr;
        numberOfRelaxingHoursStr = JOptionPane.showInputDialog("How many hours would you like to relax \n" +
                "every week day?");

        String numberOfWeekendRelaxingHoursStr;
        numberOfWeekendRelaxingHoursStr = JOptionPane.showInputDialog("How many hours would you like to \n" +
                "relax every weekend day?");

        numberOfSleepingHours = Double.parseDouble(numberOfSleepingHoursStr);
        numberOfWorkingHours = Double.parseDouble(numberOfWorkingHoursStr);
        numberOfRelaxingHours = Double.parseDouble(numberOfRelaxingHoursStr);
        numberOfWeekendRelaxingHours = Double.parseDouble(numberOfWeekendRelaxingHoursStr);

        //3 is subtracted to account for miscellaneous tasks like cleaning, walking the dog etc.

        double availableHoursForWeekday = 24 - numberOfSleepingHours - numberOfWorkingHours -
                                         numberOfRelaxingHours - 3;

        double availableHoursForWeekend = 24 - numberOfSleepingHours - numberOfWeekendRelaxingHours - 3;

        double availableHoursForWeek = 5 * availableHoursForWeekday + 2 * availableHoursForWeekend;

        System.out.println("So, you have: " + availableHoursForWeekday + " hours available for studying \n" +
                "each week day.");
        System.out.println("And you have: " + availableHoursForWeekend + " hours available for studying \n" +
                "each day on the weekend.");
        System.out.println("All that added up and you have: " + availableHoursForWeek + " hours available \n" +
                "each week for studying. \n" +
                "Good luck!");

    }
}