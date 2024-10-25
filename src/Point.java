public class Point
{
    private double xPos;
    private double yPos;

    public Point(){
        xPos = 0;
        yPos = 0;
    }

    public Point(double x, double y){
        xPos = x;
        yPos = y;
    }

    public double getX(){
        return xPos;
    }

    public double getY(){
        return yPos;
    }

    public void move(double x, double y){
        xPos += x;
        yPos += y;
    }

    public int getQuadrant(){

        //quadrant I
        if(xPos >= 0 && yPos >= 0){
            return 1;
        }
        //quadrant II
        else if(xPos < 0 && yPos >= 0){
            return 2;
        }
        //quadrant III
        else if(xPos <0 && yPos < 0){
            return 3;
        }
        //quadrant IV
        else{
            return 4;
        }
    }

    //pythagorean theorem
    public double dist(Point p){
        return Math.sqrt((Math.pow(xPos + p.getX(), 2)) + (Math.pow(yPos + p.getY(), 2)));
    }
}
