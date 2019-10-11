package test;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {

    public static void main(String[] arg) {
    int[] bitCached = new int[100];
        for(int i=0 ;i< 100;i++){
            bitCached[i] = 1<<i;
        }

        for(int each : bitCached){
            System.out.println(each);
        }

    }
}
