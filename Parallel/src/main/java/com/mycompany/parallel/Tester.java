
package com.mycompany.parallel;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;


public class Tester {
    
    public static void main (String[] args){
        try{  
    int Option,Exit;
        
    Arrayx main=null;
    
    do { 
        
    UIManager.put("OptionPane.messageFont", new Font("Montserrat", Font.BOLD, 14));
    UIManager.put("OptionPane.buttonFont", new Font("Montserrat", Font.PLAIN, 12));  
    //rgb(0,150,136)
    //rgb(120,144,156)
    UIManager UI=new UIManager();
    UIManager.put("OptionPane.background",new ColorUIResource(0,150,136));
    UIManager.put("Panel.background",new ColorUIResource(120,144,156));
    
       
     
    Option=Integer.parseInt(JOptionPane.showInputDialog(
        
    "     ----------------Main Menu----------------\n"+"\n"+
                    
    "1. Create and Register Data  \n"+"\n"+
                    
    "2. Sort the array \n"+"\n"+
                    
    "3. Show the products information .  \n"+"\n"+
            
    "4. Shearch a product by code .  \n"+"\n"+
                    
    "5. Show all products who has a price more than 2500 and minus of 5 unitys.  \n"+"\n"+
                    
    "6. Show the multiplication between the price an the amount of all the prducts  .  \n"+"\n"+
                    
    "7. Exit.\n"+"\n"+
            
    " Please enter an option : "));
            
                
    switch(Option){
    case 1:
                    
    try{
        
    main=new Arrayx();
                        
    }catch(NegativeArraySizeException a){
                       
    JOptionPane.showMessageDialog(null, "DO NOT INSERT NEGATIVE NUMBERS "
                                 + "FOR THE ARRAY LENGHT");
                   
    }catch(NumberFormatException b){
                        
    JOptionPane.showMessageDialog(null, " DO NOT INSERT LETTERS,SIGNS \n"
                                  + " OR AN EXAGGERATED AMOUNT OF  \n"
                                  + " NUMBERS IN THE ARRAY PLEASE ");
    }catch(NullPointerException d){
                        
    d.printStackTrace();
                        
    JOptionPane.showMessageDialog(null, "please be logic ");
    }
                   
    break;
    
    case 2:
    if(main==null)
    JOptionPane.showMessageDialog(null, "Vector without data!");
    else{
    main.setSortBubble();
    
    }
    break;
    case 3:
                    
    if(main==null)
    JOptionPane.showMessageDialog(null, "Vector without data!");
    else{
    try{
    main.getShowInformation();
    } catch(NumberFormatException b){
    JOptionPane.showMessageDialog(null, "DO NOT INSERT LETERS, SIGNS\n"
                                       + "OR EXAGGERATE AMOUNT OF NUMBERS \n"
                                       +" IN THE LICENSE PLATE PLEASE");
    }
    }
    break;
    case 4:
    if(main==null)
    JOptionPane.showMessageDialog(null, "Vector without data!");
    else{
    try{
    main.perCode();
    }catch(ArrayIndexOutOfBoundsException c){
    JOptionPane.showMessageDialog(null,"Please dont do it");
    }
    }
    break;
    
    case 5:
    if(main==null)
    JOptionPane.showMessageDialog(null, "Vector without data!");
    else{
    try{
    main.Conditionals();
    }catch(ArrayIndexOutOfBoundsException c){
    JOptionPane.showMessageDialog(null,"Please be logic");
    }
    }
    break;
    
    case 6:
    if(main==null)
    JOptionPane.showMessageDialog(null, "Vector without data!");
    else{
    try{
    main.Mult();
    }catch(ArrayIndexOutOfBoundsException c){
    JOptionPane.showMessageDialog(null,"Please be logic");
    }
    }
    break;
               
    case 7:
    Exit=JOptionPane.showConfirmDialog(null, "¿Do you want to exit from the Menu?");
    if (Exit==0) {
       
     
    break;
                    }
    default:
                 
    JOptionPane.showMessageDialog(null, "Non valid option ");
                     
    break;
            
    }
                     
   
    }while (Option != 7);
    
    
    System.exit(0);
          
     
    } catch(NumberFormatException a){
        
    JOptionPane.showMessageDialog(null, "BE LOGIC PLEASE");
                      
                      
      }
     }
    
    }
    
