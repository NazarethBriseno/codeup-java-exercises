package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;
    //Constructor for Quadrilateral
    public Quadrilateral(){
    }
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
    //Getter for Length
    public double getLength() {
        return length;
    }
    //Setter for length
    public abstract  void setLength(double length);
    //Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public abstract void setWidth(double width);



}
