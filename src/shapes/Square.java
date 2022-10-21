package shapes;

public class Square extends Rectangle {
    private double side;
    public double getPerimeter(){
        return 4 * side;
    }

    public double getArea(){
        return Math.pow(super.length, 2);
    }
    public Square(double side){
        super(side, side);
        this.side = side;
    }



}
