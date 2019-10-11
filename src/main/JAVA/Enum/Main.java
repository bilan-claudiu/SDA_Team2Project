package main.JAVA.Enum;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Animal3 animal =Animal3.DOG;
        switch(animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                break;
            default:
                break;
        }
        System.out.println(Animal3.DOG);//Dog and This animal is called: Fido
        System.out.println("Enum name as a string: "
                + Animal3.DOG.name());//Enum name as a string: DOG
        System.out.println(Animal3.MOUSE.getName());//Jerry
        System.out.println(Animal3.MOUSE.getClass());//class enums.Animal
        System.out.println(Animal3.DOG instanceof Object);//true
        System.out.println(Animal3.DOG instanceof Enum);//true
        Animal3 animal2 = Animal3.valueOf("CAT");
        System.out.println(animal2);//This animal is called: Fergus
    }
    }

