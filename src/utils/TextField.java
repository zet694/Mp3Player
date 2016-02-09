package utils;

import javax.swing.JTextField;

public class TextField {

    private JTextField textfield;
  
    
    public static void CheckTextField(JTextField textField){
        if (textField.getText().equals("Введите название песни...")){
            textField.setText("");
            System.out.println("Надпись");
        }
    }
    public static void checkLostField(JTextField textField){
        if (textField.getText().equals("")){
            textField.setText("Введите название песни...");
        }
    }
        
    
}
