package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class GetValues {

    private ArrayList<Integer> valuesTab = new ArrayList<Integer>();

    Scanner scanner = new Scanner(System.in);

    public void typeValues()
    {
        System.out.printf("Podaj 10 wartości");
        for (int i = 0; i < 10; i++) {
            this.valuesTab.add(scanner.nextInt());
        }
    }

    public GetValues() {
    }

    public ArrayList<Integer> getValuesTab() {
        return this.valuesTab;
    }

    public void setValues(ArrayList<Integer> values) {
        this.valuesTab = values;
    }

    @Override
    public String toString() {
        return "getValues{" +
                "valuesTab=" + valuesTab +
                '}';
    }
}
