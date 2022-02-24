package advanced.covarient_return_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by amitgade on 24-Feb-2022
 */
class Flower {

    String flowerName;

    String whatsYourName() {
        return flowerName;
    }
}

class Jasmine extends Flower {
    String flowerName;

    public Jasmine(String flowerName) {
        this.flowerName = flowerName;
    }

    String whatsYourName() {
        return flowerName;
    }
}

class Lily extends Flower {
    String flowerName;

    public Lily(String flowerName) {
        this.flowerName = flowerName;
    }

    String whatsYourName() {
        return flowerName;
    }
}

class Region {

    Flower nationalFlower;

    public Flower yourNationalFlower() {
        return nationalFlower;
    }
}

class WestBengal extends Region {
    Flower nationalFlower = new Jasmine("Jasmine");


    public Flower yourNationalFlower() {
        return nationalFlower;
    }

}

class AndhraPradesh extends Region {
    Flower nationalFlower = new Lily("Lily");

    public Flower yourNationalFlower() {
        return nationalFlower;
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}