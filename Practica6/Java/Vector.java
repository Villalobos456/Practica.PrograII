package Practica6.Java;
class Vector {
    private double x;
    private double y;
    private double z;
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double Producto(Vector b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }
    public Vector Cross(Vector b) {
        return new Vector(
            this.y * b.z - this.z * b.y,
            this.z * b.x - this.x * b.z,
            this.x * b.y - this.y * b.x
        );
    }
    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public boolean isPerpendicular(Vector b) {
        return this.Producto(b) == 0;
    }
    public boolean isParallel(Vector b) {
        Vector cross = this.Cross(b);
        return cross.x == 0 && cross.y == 0 && cross.z == 0;
    }
    public Vector projectionOnto(Vector b) {
        double scalar = this.Producto(b) / b.Producto(b);
        return new Vector(b.x * scalar, b.y * scalar, b.z * scalar);
    }
    public void print() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}