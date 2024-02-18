package org.example;

import java.util.ArrayList;

public class Sterams {
    public static void main(String[]args){
        ArrayList<String>list=new ArrayList();
         list.add("selenium");
         list.add("Postman");
         list.add("Cypress");
          list.add("Jenkins");
          String count="";
          String findone="selenium";
          for(int i=0;i<list.size();i++)
          {
              count=list.get(i);
              if(count==findone){
                  System.out.println(findone+" "+" is matched");
                  continue;
              }

              }

          }
    }

