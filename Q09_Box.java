package workshop;

// Question 9: Box class with constructor overloading for cube, cuboid, and default

public class Q09_Box {
    double width, height, depth;

    // No-argument constructor: sets default dimensions 10 x 8 x 12
    Q09_Box() {
        width = 10;
        height = 8;
        depth = 12;
    }

    // Cube constructor: takes single length
    Q09_Box(double length) {
        width = length;
        height = length;
        depth = length;
    }

    // Cuboid constructor: takes length, breadth, and height
    Q09_Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void getVolume() {
        System.out.println("Volume: " + (width * height * depth));
    }

    public static void main(String[] args) {
        Q09_Box defaultBox = new Q09_Box();        // Default: 10 x 8 x 12
        defaultBox.getVolume();

        Q09_Box cube = new Q09_Box(5);             // Cube: 5 x 5 x 5
        cube.getVolume();

        Q09_Box cuboid = new Q09_Box(3, 4, 6);     // Cuboid: 3 x 4 x 6
        cuboid.getVolume();
    }
}
