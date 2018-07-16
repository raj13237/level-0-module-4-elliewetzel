//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday=false, isVacation=false;
        
        /* You MUST use the above boolean variables in your code */
        
         int answer =JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         System.out.print(answer);
         if(answer ==0) {
        	 	isWeekday = true;

         }
         else if(answer ==1) {
        	 isWeekday=false;
         }
         int response = JOptionPane.showConfirmDialog(null, "Is it a vacation", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         if(response ==0) {
        	 isVacation = true;
         }
         else if(response ==1) {
        	 isVacation=false;
         }

        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
         if(isVacation==true || isWeekday==false) {
        	 JOptionPane.showMessageDialog(null, "sleep in");
         }
         else if(isVacation ==false || isWeekday==true) {
        	 JOptionPane.showMessageDialog(null, "get up lazybones!");
         }
         else if(isVacation==true && isWeekday== true) {
        	 JOptionPane.showMessageDialog(null, "sleep in");
         }
    }
}
