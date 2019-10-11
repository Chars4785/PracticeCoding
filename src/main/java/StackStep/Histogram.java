//package StackStep;
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Histogram {
//
//    public static void main(String[] args) {
//        int[] topValue = new int[100_000];
//        int maxArea = 0;
//
//        Stack<Integer> stack = new Stack<>();
//
//        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();
//
//        for (int i = 0; i < count; i++) {
//            topValue[i] = scanner.nextInt();
//        }
//
//
//        int inx = 1;
//
//        for (int i = 0; i < count; i++) {
//
//                while(topValue[stack.peek()] >= topValue[i]) {
//                    int temp = i - stack.peek();
//                    if ((temp * topValue[stack.peek()]) > maxArea){
//                        maxArea = temp * topValue[stack.peek()];
//                    }
//                    stack.pop();
//                }
//
//                stack.push(i);
//
//
//
//
//        }
//
//    }
//
//
//}
