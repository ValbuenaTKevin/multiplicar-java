/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicarnumeros;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MultiplicarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int res = n1 * n2;
        System.out.println(res);
        scanner.close();
    }
}
