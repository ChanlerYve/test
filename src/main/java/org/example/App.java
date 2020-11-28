package org.example;

//import org.apache.commons.math3.linear.OpenMapRealVector;

import java.util.Scanner;
public class App {



    private int [] judgeData= { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private int month, day, monFlag = 0, dayFlag = 0;

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonFlag() {
        return monFlag;
    }

    public int getDayFlag() {
        return dayFlag;
    }

    public void setDay(int day) {
        this.day = day;
    }

    //检查月份（1-12）
    public int checkMonth() {

        if (month > 0 && month < 13) {
            monFlag = 1;
        }
        else
        {
            monFlag = 0;
        }
        return monFlag;
    }

    //检查日期（1-top）
    public boolean checkDay() {
        int top = judgeData[month];
        boolean dflag;

        //此处注入错误，正确表达式应为if (day > 0 && day <= top)
        if (day > 0 && day <= top) {
            dayFlag = 1;
            dflag = true;
        }
        else
        {
            dayFlag = 0;
            dflag = false;
        }
        return dflag;
    }


    public boolean judgeAll(){
        checkMonth();
        if (monFlag == 0) {
            System.out.println ( "月份非法\n");
            return false;
        }else
        {
            //checkDay();
            if (!checkDay()) {
                System.out.println( "日期非法\n");
                return false;
            }
            else
            {
                System.out.println ( "输入合法\n");
                return true;
            }

        }
    }

    public  static void main(String[] args){

        System.out.println ( "分别输入月、日:\n" ) ;

        Scanner sc = new Scanner(System.in);
        int tmonth = sc.nextInt();
        int tday = sc.nextInt();

        App Judger = new App();

        Judger.setMonth(tmonth);
        Judger.setDay(tday);

        Judger.judgeAll();

        //OpenMapRealVector openMapRealVector=new OpenMapRealVector(7);

    }

}
