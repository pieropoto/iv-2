package org.example;

public class Rectangle {
    private int lenght;
    private int width;

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }

    public int getArea(){
        return lenght*width;
    }

    public int getPerimeter(){
        return 2 * (lenght+width);
    }
}
