package Practica6.Java;
public class main {
    public static void main(String[] args) {
        Vector a = new Vector(3, 4, 0);
        Vector b = new Vector(1, 2, 0);
        System.out.println("perpendivular " + a.isPerpendicular(b));
        System.out.println("Paralelos " + a.isParallel(b));
        System.out.print("Proyección de a sobre b: ");
        a.projectionOnto(b).print();
    }
}