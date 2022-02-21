/*
 * @autor Francisco Bañuelos.
 */
package trucos.area;

public class AreaFinder {

    void area(int side){
        System.out.println("Area : "+ (side*side));
    }
    void area(int length, int width){
        System.out.println("Area : "+ (length*width));
    }
}
class Main{
    public static void main(String []args){
        AreaFinder area = new AreaFinder();
        area.area(10);
        area.area(20,10);

    }
}