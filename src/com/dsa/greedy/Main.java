package com.dsa.greedy;

import java.util.*;

class Activity {
    int start;
    int end;

    Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {

    public static int activitySelection(int[] start, int[] end) {

        int n = start.length;

        List<Activity> activities = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            activities.add(new Activity(start[i], end[i]));
        }

        // Sort by end time
        activities.sort((a, b) -> a.end - b.end);

        int count = 1;

        int lastEnd = activities.get(0).end;

        System.out.println("Selected Activities:");
        System.out.println("(" + activities.get(0).start + "," + activities.get(0).end + ")");

        for (int i = 1; i < n; i++) {

            Activity current = activities.get(i);

            if (current.start >= lastEnd) {

                count++;

                lastEnd = current.end;

                System.out.println("(" + current.start + "," + current.end + ")");
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};

        int answer = activitySelection(start, end);

        System.out.println("Maximum Activities = " + answer);
    }
}