/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam;

/**
 *
 * @author Guest
 */
public class ExamTest {
    
        public static void main(String []args){
    
    String name="Faith";
    
    double height=1.0;
    
    double weight=60.5;
    
       
    
        for(double i=0.0; i<3.0; i++){
          height ++; weight ++;
          
            
           if(getBMI(weight,height)>=25.0){
               System.out.println(getBMI(weight,height)+ " Is overweight");
           }
           
           if(getBMI(weight, height)<25.0){
               System.out.println(getBMI(weight, height)+ " Is healthy");
           }
           
           if(getBMI(weight,height)<18.5){
               System.out.println(getBMI(weight,height)+"Is underweight");
           } 
        }
       
         
         
                                                        
                    
        }
            
    
    
        
    public static double getBMI(double w, double h){
        double BMI=w/h;
        return BMI;
            }
    
     
                      
     }
        
        
        
        
    
    
    

