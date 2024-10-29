public class Point
{
    private double x;
    private double y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    public int getQuadrant(){
        //possibly stinky code

        //quadrant I
        if(x >= 0 && y >= 0){
            return 1;
        }
        //quadrant II
        else if(x < 0 && y >= 0){
            return 2;
        }
        //quadrant III
        else if(x <0 && y < 0){
            return 3;
        }
        //quadrant IV
        else{
            return 4;
        }
    }

    //pythagorean theorem
    public double dist(Point p){
        return Math.sqrt((Math.pow(x - p.getX(), 2)) + (Math.pow(y - p.getY(), 2)));
    }
}
