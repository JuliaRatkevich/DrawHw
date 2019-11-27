package com.julia;

public class Picture {

    private Shape [] shapes;

    public Picture( Shape[] shapes) {
        this.shapes = shapes;
    }


    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println();
        }

    }
}
