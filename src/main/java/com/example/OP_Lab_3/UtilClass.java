package com.example.OP_Lab_3;

import java.util.ArrayList;

public class UtilClass {
    private ArrayList superArray;
    private ArrayList arrStart;
    private ArrayList arrFinish;
    private ArrayList arrStep;
    private int formula;

    public UtilClass(ArrayList arrStart, ArrayList arrFinish, ArrayList arrStep, int formula) {
        this.superArray = new ArrayList<ArrayList>();
        this.arrStart = arrStart;
        this.arrFinish = arrFinish;
        this.arrStep = arrStep;
        this.formula = formula;
    }

    public ArrayList<ArrayList> action( int formula) {

        switch (formula) {
            case 1:
                return subAction1(arrStart, arrFinish, arrStep, superArray);
            case 2:
                return subAction2(arrStart, arrFinish, arrStep, superArray);
            case 3:
                return subAction3(arrStart, arrFinish, arrStep, superArray);
            default:
                return superArray;

        }

    }

    private static ArrayList subAction1 (ArrayList arrStart, ArrayList arrFinish, ArrayList arrStep, ArrayList superArray) {
        for(double a =(double) arrStart.get(0); a<=(double)arrFinish.get(0); a +=(double) arrStep.get(0) ) {
            arrStart.set(0, a);
            for(double b =(double) arrStart.get(1); b<=(double)arrFinish.get(1); b +=(double) arrStep.get(1) ) {
                arrStart.set(1, b);
                for (double c =(double) arrStart.get(2); c<=(double)arrFinish.get(2); c +=(double) arrStep.get(2) ) {
                    arrStart.set(2, c);
                    for(double d =(double) arrStart.get(3); d<=(double)arrFinish.get(3); d +=(double) arrStep.get(3) ) {
                        ArrayList toAdd = new ArrayList();
                        toAdd.add(a);
                        toAdd.add(b);
                        toAdd.add(c);
                        toAdd.add(d);
                        toAdd.add((3 * ((Math.log10(Math.abs(b/a)))) + Math.sqrt(Math.sin(c) + Math.pow(Math.E, d))));
                        superArray.add(toAdd);
                    }
                }
            }
        }
        return superArray;
    }

    private static ArrayList subAction2 (ArrayList arrStart, ArrayList arrFinish, ArrayList arrStep, ArrayList superArray) {
        for(double a =(double) arrStart.get(0); a<=(double)arrFinish.get(0); a +=(double) arrStep.get(0) ) {
            arrStart.set(0, a);
            for(double b =(double) arrStart.get(1); b<=(double)arrFinish.get(1); b +=(double) arrStep.get(1) ) {
                arrStart.set(1, b);
                for (double c =(double) arrStart.get(2); c<=(double)arrFinish.get(2); c +=(double) arrStep.get(2) ) {
                    arrStart.set(2, c);
                    for(double d =(double) arrStart.get(3); d<=(double)arrFinish.get(3); d +=(double) arrStep.get(3) ) {
                        ArrayList toAdd = new ArrayList();
                        toAdd.add(a);
                        toAdd.add(b);
                        toAdd.add(c);
                        toAdd.add(d);
                        toAdd.add((3 * ((Math.log10(Math.abs(b/a)))) + Math.sqrt(Math.sin(c) + Math.pow(Math.E, d))));
                        superArray.add(toAdd);
                    }
                }
            }
        }
        return superArray;
    }

    private static ArrayList subAction3 (ArrayList arrStart, ArrayList arrFinish, ArrayList arrStep, ArrayList superArray) {
        for(double a =(double) arrStart.get(0); a<=(double)arrFinish.get(0); a +=(double) arrStep.get(0) ) {
            for(double b =(double) arrStart.get(1); b<=(double)arrFinish.get(1); b +=(double) arrStep.get(1) ) {
                for (double c =(double) arrStart.get(2); c<=(double)arrFinish.get(2); c +=(double) arrStep.get(2) ) {
                    for(double d =(double) arrStart.get(3); d<=(double)arrFinish.get(3); d +=(double) arrStep.get(3) ) {
                        ArrayList toAdd = new ArrayList();
                        toAdd.add(a);
                        toAdd.add(b);
                        toAdd.add(c);
                        toAdd.add(d);
                        toAdd.add((3 * ((Math.log10(Math.abs(b/a)))) + Math.sqrt(Math.sin(c) + Math.pow(Math.E, d))));
                        superArray.add(toAdd);
                    }
                }
            }
        }
        return superArray;
    }
}
