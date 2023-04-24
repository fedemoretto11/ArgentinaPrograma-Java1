/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.s.exercises;

/**
 *
 * @author fedmo
 */
public class Count {
    public static void main(String[] args) {
        int num = 30;
        boolean stop = false;
        
        while (!stop) {
            switch(num) {
                case 1:
                    stop = true;
                    break;
                default:
                    if (num % 2 == 0) {
                        num = num / 2;
                    } else {
                        num = num * 3 + 1;
                    }
                    break;
                          
            }
        System.out.println(num);    
        }
       
               
    }
}
