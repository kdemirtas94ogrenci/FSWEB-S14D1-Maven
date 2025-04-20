package com.workintech.developers;

import java.util.ArrayList;

public class HRManager extends  Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.seniorDevelopers = seniorDevelopers;
        this.midDevelopers = midDevelopers;
    }

    public void addEmployee(JuniorDeveloper developer){
        boolean added = false;
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = developer;
                System.out.println("Junior developer eklendi: " + developer.getName());
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("Junior developer dizisi dolu, yeni çalışan eklenemedi.");
        }
    }
    public void addEmployee(MidDeveloper developer){
        boolean added = false;
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = developer;
                System.out.println("Junior developer eklendi: " + developer.getName());
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("Junior developer dizisi dolu, yeni çalışan eklenemedi.");
        }
    }
    public void addEmployee(SeniorDeveloper developer){
        boolean added = false;
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = developer;
                System.out.println("Junior developer eklendi: " + developer.getName());
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("Junior developer dizisi dolu, yeni çalışan eklenemedi.");
        }
    }


}
