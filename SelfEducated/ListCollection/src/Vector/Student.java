/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vector;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Student {
    private String rollName;
    private String name;
    private int age;

    public String getRollName() {
        return rollName;
    }

    public void setRollName(String rollName) {
        this.rollName = rollName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mã : ");
        String rollNameInput = input.nextLine();
        setRollName(rollNameInput);
        
        System.out.print("Nhập tên : ");
        String nameInput = input.nextLine();
        setName(nameInput);
        
        System.out.print("Nhập tuổi : ");
        int ageInput = input.nextInt();
        setAge(ageInput);        
    }
    
    public String showStudent() {
        return getRollName()+" | "+getName()+" | "+getAge();
    }
}
