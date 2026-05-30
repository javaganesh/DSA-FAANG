package com.dsa.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseListArray {
    public static void main(String[] args) {
        List<String>[] course= new ArrayList[3];
        for(int i=0;i<course.length;i++){
            course[i]=new ArrayList<>();
        }
        for(int i=0;i<course.length;i++){
            if(i==0){
                course[i].add("java");
                course[i].add("spring boot");
                course[i].add(" ms");
            }
            else if(i==1){
                course[i].add(".net");
                course[i].add("asp");
                course[i].add(" html");
            }
            else {
                course[i].add("db");
                course[i].add("networking");
                course[i].add(" AI");
            }

        }

        System.out.println(Arrays.toString(course));


    }
}
