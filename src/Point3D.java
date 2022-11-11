public class Point3D extends Point2D {

    private float z = 0.0f;

    private float[] arr3D = new float[3];

    public Point3D() {
    }

    public Point3D(float z, float x, float y) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float z, float x, float y) {
        arr3D[0] = x;
        arr3D[1] = y;
        arr3D[2] = z;
    }

    public float[] getXYZ() {
        return arr3D;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }
}
