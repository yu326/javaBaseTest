package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by koreyoshi on 2017/7/26.
 */
public class testException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("请输入第一个参数");
            int one = input.nextInt();
            System.out.println("请输入第二个参数");
            int two = input.nextInt();
            System.out.println("两数相除结果是：" + two / one);
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("InputMismatchException 异常~~");
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("ArithmeticException 异常~~");
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常~~");
        } finally {
            System.out.println("here is arriving~");
        }
        System.out.println("it's ending~~~");
    }
}
