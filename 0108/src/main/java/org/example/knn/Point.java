package org.example.knn;

public class Point {

    public String type;
    public int xpos;
    public int ypos;

    public Point(String type, int xpos, int ypos) {
        this.type = type;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public Point(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }
}
