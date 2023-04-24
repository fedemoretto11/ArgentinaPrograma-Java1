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
public class Ropes {
    public static void main(String[] args) {
    // Assume the ropes are stored as arrays of integers representing the time each section burns
    int[] rope1 = {3, 5, 1, 2, 6, 8, 2, 3}; // example values
    int[] rope2 = {1, 7, 3, 4, 2, 5, 6, 2}; // example values

    // Start both ropes burning from one end
    int rope1Idx = 0;
    int rope2Idx = 0;

    // Burn the ropes for 30 minutes
    int timeElapsed = 0;
    while (timeElapsed < 30) {
        timeElapsed += Math.max(rope1[rope1Idx], rope2[rope2Idx]);
        if (rope1[rope1Idx] >= rope2[rope2Idx]) {
            rope1Idx++;
        } else {
            rope2Idx++;
        }
    }

    // First rope is burnt completely, start burning other end of second rope
    rope2Idx = rope2.length - 1;
    timeElapsed += rope2[rope2Idx];

    // Burn the ropes for another 15 minutes
    while (timeElapsed < 45) {
        timeElapsed += rope2[rope2Idx];
        rope2Idx--;
    }

    // Output the time elapsed
    System.out.println("45 minutes have elapsed after " + timeElapsed + " seconds.");
}

}
