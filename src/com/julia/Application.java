package com.julia;

public class Application {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle('#', 5, 30);
        Shape line = new Line('-', 10);
        Shape line2 = new Line('^', 20);
        Shape rectangle2 = new Rectangle('$', 10, 10);

        Shape[] allShapes = new Shape[]{rectangle, line, line2, rectangle2};
        Picture picture = new Picture(allShapes);
        picture.draw();
    }
}
