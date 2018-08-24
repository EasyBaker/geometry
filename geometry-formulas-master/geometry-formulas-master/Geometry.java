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
     * @param base  length of base of parallelogram
     * @param height  height of the parallelogram
     * @return   area of the parallelogram
     */
    
    public static double parallelogramArea(double base, double height) 
    {
        return base * height;
    }
    
    /**
     * Calculates the area of a triangle.
     *
     * @param base  length of base of triangle
     * @param height  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        return base * height / 2.0;
    }
    
    /**
     * Calculates the volume of a sphere
     *
     * @param radius  radius of sphere
     * @return   volume of sphere
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calculates the area of a rectangle.
     *
     * @param base  length of base of rectangle
     * @param height  height of the rectangle
     * @return   area of the triangle
     */
    public static double rectangleArea(double base, double height)
    {
        return base * height;
    }
    
    /**
     * Calculates the area of a trapezoid.
     *
     * @param bottom length of base of trapezoid
     * @param height height of the trapezoid
     * @param top length of the trapezoid
     * @return area of the trapezoid
     */
    public static double trapezoidArea(double bottom, double top, double height)
    {
        return ((top + bottom) / 2) * height;
    }
    
    /**
     * Calculates the volume of a rectangular prism.
     *
     * @param length length of base of rectangular prism
     * @param height height of the rectangular prism
     * @param width length of the rectangular prism
     * @return volume of the rectangular prism
     */
    public static double rectprismVolume(double width, double height, double length)
    {
        return width * height * length;
    }
    
    /**
     * Calculates the volume of a rectangle.
     *
     * @param bottom length of base of trapezoid
     * @param height height of the trapezoid
     * @param top length of the trapezoid
     * @return area of the trapezoid
     */
    public static double circularconeVolume(double radius, double height)
    {
        return Math.PI * (Math.pow(radius, 2)) * (height / 3);
    }
    
    /**
     * Calculates the surface area of a rectangular prism.
     *
     * @param length length of base of rectangular prism
     * @param height height of the rectangular prism
     * @param width length of the rectangular prism
     * @return surface area of the rectangular prism
     */
    public static double rectprismsurfaceArea(double width, double length, double height)
    {
        return 2 * ((width * length) + (height * length) + (height * width));
    }
    
    /**
     * Calculates the surface area of a sphere.
     *
     * @param redius radius of base of sphere
     * @return surface area of the sphere
     */
    public static double spheresurfaceArea(double radius)
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * Calculates the hypotenuse of a right triangle.
     *
     * @param a length of side of right triangle
     * @param b length of other side of right triangle
     * @return surface area of the sphere
     */
    public static double righttriangleHypotenuse(double a, double b)
    {
        return Math.pow(a, 2) + Math.pow(b, 2);
    }
    
    /**
     * Calculates the distance between two points.
     *
     * @param x1 x value of point 1
     * @param y1 y value of point 1
     * @param x2 x value of point 2
     * @param y2 y value of point 2
     * @return surface area of the sphere
     */
    public static double distancetwoPoints(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    
    /**
     * Calculates the slope of a line between two points.
     *
     * @param x1 x value of point 1
     * @param y1 y value of point 1
     * @param x2 x value of point 2
     * @param y2 y value of point 2
     * @return surface area of the sphere
     */
    public static double slopeofLine(double x1,double y1, double x2, double y2)
    {
        return (y2 - y1)/(x2 - x1);
    }
    
    /**
     * Calculates the something of the final question.
     *
     * @param a length of something side
     * @param b length of something else side
     * @param c length of something else side
     * @return final question stuff
     */
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
        
        double fq1 = finalQuestion(5, 6, 7);
        System.out.println(fq1);
    }
}
