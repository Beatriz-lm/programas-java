/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author acer
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        System.out.println("A sua tela esta resolucao ");
        System.out.println(width + "x" + height);
    }
}
