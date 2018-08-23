/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static double rectangleArea(double base, double height)
    {
        double area = base * height;
        
        return area;
    }
    
    public static double trapezoidArea(double bottom, double top, double height)
    {
        double area = ((top + bottom) / 2) * height;
        
        return area;
    }
    
    public static double rectprismVolume(double width, double height, double length)
    {
        double volume = width * height * length;
        
        return volume;
    }
    
    public static double circularconeVolume(double radius, double height)
    {
        double volume = Math.PI * (Math.pow(radius, 2)) * (height / 3);
        
        return volume;
    }
    
    public static double rectprismsurfaceArea(double width, double length, double height)
    {
        double area = 2 * ((width * length) + (height * length) + (height * width));
        
        return area;
    }
    
    public static double spheresurfaceArea(double radius)
    {
        double area = 4 * Math.PI * Math.pow(radius, 2);
        
        return area;
    }
    
    public static double righttriangleHypotenuse(double a, double b)
    {
        double hypotenuse = Math.pow(a, 2) + Math.pow(b, 2);
        
        return hypotenuse;
    }
    
    public static double distancetwoPoints(double x1, double y1, double x2, double y2)
    {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        
        return distance;
    }
    
    public static double slopeofLine(double x1,double y1, double x2, double y2)
    {
        double slope = (y2 - y1)/(x2 - x1);
        
        return slope;
    }
    
    public static double finalQuestion(double a, double b, double c)
    {
        double p = (a + b + c) / 2;
        double area = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        
        return area;
    }
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);
        
        double tra1 = trapezoidArea(2, 2, 2);
        
        System.out.println(tra1);
        
        double rp1 = rectprismVolume(2, 2, 2);
        
        System.out.println(rp1);
        
        double cc1 = circularconeVolume(2, 2);
        
        System.out.println(cc1);
        
        double rps1 = rectprismsurfaceArea(2, 2, 2);
        
        System.out.println(rps1);
        
        double ss1 = spheresurfaceArea(2);
        
        System.out.println(ss1);
        
        double rt1 = righttriangleHypotenuse(2, 2);
        
        System.out.println(rt1);
        
        double dt1 = distancetwoPoints(1, 1, 2, 2);
        
        System.out.println(dt1);
        
        double so1 = slopeofLine(1, 1, 2, 2);
        
        System.out.println(so1);
        
        double fq1 = finalQuestion(1, 2, 3);
        
        System.out.println(fq1);
    }
}
