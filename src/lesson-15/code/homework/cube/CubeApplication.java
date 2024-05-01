package homework.cube;

import homework.cube.model.Cube;

public class CubeApplication {
    public static void main(String[] args) {

        Cube cube1 = new Cube(12);
        Cube cube2 = new Cube(13);
        Cube cube3 = new Cube(22);

        cube1.perimeter();
        System.out.println("Perimeter of cube1 = "+ cube1.perimeter());

        cube2.square();
        System.out.println("Square of cube2 = " + cube2.square());

        cube3.volume();
        System.out.println("Volume of cube3 = " + cube3.volume());
    }
}
