package calculatebmi;

import javax.swing.JOptionPane;
//Import Java API needed

public class CalculateBmi {

    public static void main(String[] args) {
        // Input is String Type. So we define String type variables to record height and weight
        String strHt;
        String strWt;
        
        //This is one way to record user input
        strHt = JOptionPane.showInputDialog(null, "Please enter height in meters");
        strWt = JOptionPane.showInputDialog(null, "Please enter weight in kilogrammes");
        
        //Define variables needed for calculations
        double ht;
        double wt;
        double bmi;
        
        //This is one way to convert String to double
        ht = Double.parseDouble(strHt);
        wt = Double.parseDouble(strWt);

        bmi = wt/(ht*ht);
        
        //Define variables needed for Display
        String resultDisplay = "Your BMI is " + bmi + " kg/m2" ;
        
        //This is one way to Display Result
        JOptionPane.showMessageDialog(null, resultDisplay);
       
        
    }
    
}
