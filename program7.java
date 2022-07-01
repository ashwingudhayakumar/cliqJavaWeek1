import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.HashMap;

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

import java.time.*;
import java.util.*;

class MyClass {
    static GregorianCalendar gc = new GregorianCalendar();
    static boolean isLeapYear(int year){
       
        return gc.isLeapYear(year);
    }
    static String[] dateSpliterFromGetDate(String referingDate){
        String[] split = referingDate.split(" ");
        for(int i=0;i<split.length;i++){
            split[i]=split[i].replace(",","");
        }
        return split;
    }
    
    static int equivalentNumForMonth(String searchMonthVal){
          HashMap<String, Integer> equivalentNumForMonth = new HashMap<>();
    String []months=new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        
        for(int i=1;i<=months.length;i++){
           equivalentNumForMonth.put(months[i-1],i);
        }
        
        return equivalentNumForMonth.get(searchMonthVal);
        
    }
    
    static String[] dateSpliterFromCurrentDate(String referingCurrentDate){
        String[] split = referingCurrentDate.split("-");
        return split;
    }
    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        String getDate=sc.nextLine();
        String []splitedDate=dateSpliterFromGetDate(getDate);
        int getMonthFromDate=equivalentNumForMonth(splitedDate[0]);
        int getDayFromDate=Integer.parseInt(splitedDate[1]);
        int getYearFromDate=Integer.parseInt(splitedDate[2]);
        
        //System.out.println(getMonthFromDate+" "+getDayFromDate+" "+getYearFromDate+" ");
        
        long millis=System.currentTimeMillis();  
        java.sql.Date date = new java.sql.Date(millis); 
        String currentDate=date.toString();
        String []splitedCurrentDate=dateSpliterFromCurrentDate(currentDate);
        int getMonthFromCurrentDate=Integer.parseInt(splitedCurrentDate[1]);
        int getDayFromCurrentDate=Integer.parseInt(splitedCurrentDate[2]);
        int getYearFromCurrentDate=Integer.parseInt(splitedCurrentDate[0]);
         //System.out.println(getMonthFromCurrentDate+" "+getDayFromCurrentDate+" "+getYearFromCurrentDate+" "); 
         
         
         
       // System.out.println(isLeapYear(2020));
       
       LocalDate start_date= LocalDate.of(getYearFromDate,getMonthFromDate,getDayFromDate);
       LocalDate end_date= LocalDate.of(getYearFromCurrentDate,getMonthFromCurrentDate,getDayFromCurrentDate);
       Period diff= Period.between(start_date,end_date);
      if(diff.getYears()<0 || diff.getMonths()<0 || diff.getDays()<0){
          System.out.println(Math.abs(diff.getYears())+"years "+Math.abs(diff.getMonths())+"Months"+Math.abs(diff.getDays())+"days later");
      }
      else if(diff.getYears()>0 || diff.getMonths()>0 || diff.getDays()>0){
          System.out.println(diff.getYears()+"years"+diff.getMonths()+"Months"+diff.getDays()+"days ago"); 
      }
      else{
          System.out.println("today"); 
      }
       
     
    }
}
