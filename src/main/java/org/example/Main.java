package org.example;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GetValues getValues = new GetValues();
        FileManager fileManager = new FileManager();
        SortSystem sortSystem = new SortSystem();

        getValues.typeValues();
        System.out.println(getValues.getValuesTab());
        System.out.println(sortSystem.sortAscending(getValues.getValuesTab()));
        System.out.println(sortSystem.sortDescending(getValues.getValuesTab()));

        fileManager.saveToFile("dane.txt", getValues.getValuesTab());
        fileManager.saveToFile("rosnaco.txt", sortSystem.sortAscending(getValues.getValuesTab()));
        fileManager.saveToFile("malejaco.txt", sortSystem.sortDescending(getValues.getValuesTab()));

    }
}