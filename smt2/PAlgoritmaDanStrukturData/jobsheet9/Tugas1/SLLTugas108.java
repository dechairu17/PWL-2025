package Tugas1;

import java.util.Scanner;

public class SLLTugas108 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 
        LinkedList08 singLL = new LinkedList08(); 
 
        singLL.print(); 
        singLL.addFirst(112, "prita");
        singLL.print();
        singLL.addLast(113, "yusuf");
        singLL.print();
        singLL.addFirst(111, "anton");
        singLL.print();
        singLL.insertAfter(113, 114, "sari");
        singLL.print();
        singLL.insertAt(3, 115, "doni");
        singLL.print();
        }       
}
