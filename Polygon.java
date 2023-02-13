import java.text.DecimalFormat;

public class Polygon {
    private int numSides;
    private double sideLength;
    private String shapeType;
    private double perimeter;

    private String prtStr;
    public Polygon(int ns, double sl, String st){
        numSides = ns;
        shapeType = st;
        sideLength = sl;
       if(numSides<3) {

           System.out.println("Number of sides needs to be greater than 2 ");

       return;
       }
        if(sideLength<0) {

            System.out.println("Side length needs to be greater than 0 ");

            return;
        }


    }
    public Polygon(){
        numSides = 3;
        shapeType = "Triangle";
        sideLength = 1.0;
        perimeter = 3.0;

    }
    public int getNumSides(){

        return numSides;
    }
    public double getSideLength(){
        return sideLength;

    }
    public String getShapeType(){

        return shapeType;
    }
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public void setSideLength(double sideLength){
        this.sideLength = sideLength;
    }

    public void setShapeName(String shapeType){
        this.shapeType = shapeType;
    }


    public  double calculatePerimeter(){
        perimeter = numSides * sideLength;
        perimeter= Math.round(perimeter*1000.0)/1000.0;

        return perimeter;

    }
    public double getPerimeter(){
        return (perimeter);
    }

        public String toString(){


           DecimalFormat df = new DecimalFormat("#.###");

           prtStr = "Name of polygon: "+ shapeType + "," + " Number of sides: " + numSides +  "," +" Side Length: " + sideLength +"," + " Perimeter: " + df.format(perimeter);
            return prtStr;



    }

}