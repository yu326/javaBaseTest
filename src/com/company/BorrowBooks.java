package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by koreyoshi on 2017/7/26.
 */

public class BorrowBooks {
    /**
     * 借书系统
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] books = {"编程之美", "数据结构", "人间词话", "你是人间的四月天", "百年孤独"};
        for (int i = 0; i < books.length; i++) {
            System.out.println("the i is:" + i + "  books name is:" + books[i]);
        }

        try {
            System.out.println("程序开始了呢 ");
            Scanner input = new Scanner(System.in);
            System.out.println("借书系统！  根据图书名借书1,,根据编号输出2");
            int type = input.nextInt();
            Boolean res = false;
            if (type == 1) {
                System.out.println("请输入图书名！");
                String bookname = input.next();
                for (int i = 0; i < books.length; i++) {
                    if (books[i] == bookname) {
                        res = true;
                        System.out.println("图书存在！编号是：" + i + " .图书名是：" + bookname);
                        break;
                    }
                }
                if (!res) {
                    System.out.println("图书不存在");
                }

            } else if (type == 2) {
                try {
                    System.out.println("请输入图书编号！");
                    int bookid = input.nextInt();
                    for (int i = 0; i < books.length; i++) {
                        if (i == bookid) {
                            res = true;
                            System.out.println("图书存在！编号是：" + i + " .图书名是：" + books[i]);
                            break;
                        }
                    }
                    if (!res) {
                        System.out.println("图书不存在");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("请输入正确编号");
                    e.printStackTrace();
                }


            } else {
                System.out.println("输入类型错误~~");
                throw new RuntimeException("输入类型错误");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常出现了~~");
        }

    }


}
