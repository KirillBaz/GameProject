package Units;
import Units.BaseUnit;

import javax.swing.text.Position;
import java.util.Objects;

public class Coordinates {
    public int x;
    public int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Double targetDistance (BaseUnit target) {
        double distance;
        distance = Math.sqrt((Math.pow(target.position.getX() - this.getX(), 2)) + (Math.pow(target.position.getY() - this.getY(), 2)));
        return distance;
    }
    @Override
    public String toString() {
        return "Location: " +
                "x=" + x +
                ", y=" + y;
    }
    public Coordinates getDiff (Coordinates enemyCoordinates){
        return new Coordinates(x-enemyCoordinates.x, y - enemyCoordinates.y);
    }

    public boolean equals(Coordinates target) {
        return x == target.x && y == target.y;
    }

}
