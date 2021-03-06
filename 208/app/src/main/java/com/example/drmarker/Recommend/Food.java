
package com.example.drmarker.Recommend;

import io.realm.RealmObject;

/**
 *
 * @author Zisen Lin. lmo.
 */
public class Food extends RealmObject{
    private String name;
    private int unit;
    private double calories;
    private double protein;
    private double carbohydrate;
    private double fat;
    private String type;
    private boolean forBreakfast;

    public Food() {
        // Null Constructor.
    }
    
    public Food(String name, int unit, double calories, double protein, double carbohydrate, double fat, String type, boolean forBreakfast) {
        this.name = name;
        this.unit = unit;
        this.calories = calories;
        this.protein = protein;
        this.carbohydrate = carbohydrate;
        this.fat = fat;
        this.type = type;
        this.forBreakfast = forBreakfast;
        
    }

    public String getReadableName(){
        String realName = name;
        realName = realName.replace("_"," ");
        realName = realName.substring(0,1).toUpperCase()+realName.substring(1);
        return realName;
    }

    public String getName() {
        return this.name;
    }
    
    public int getUnit() {
        return this.unit;
    }
    
    public double getCalories() {
        return this.calories;
    }
    
    public double getProtein() {
        return this.protein;
    }
    
    public double getCarbohydrate() {
        return this.carbohydrate;
    }
    
    public double getFat() {
        return this.fat;
    }
    
    public String getType() {
        return this.type;
    }
    

    public boolean suitOnBreakFast() {
        return this.forBreakfast;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setUnit(int unit) {
        this.unit = unit;
    }
    
    public void setCalories(double calories) {
        this.calories = calories;
    }
    
    public void setProtein(double protein) {
        this.protein = protein;
    }
    
    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
    
    public void setFat(double fat) {
        this.fat = fat;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setForBreakFast(boolean forBreakfast) {
        this.forBreakfast = forBreakfast;
    }
    

    @Override
    public String toString() {
        return "Calories: " + this.calories + "kCal/" + this.unit + "g"
                + ";\nProtein: " + this.protein + "g/" + this.unit + "g"
                + ";\nCarbohydrate: " + this.carbohydrate + "g/ " + this.unit + "g"
                + ";\nFat: " + this.fat + "g/" + this.unit + "g.";
    }
}
