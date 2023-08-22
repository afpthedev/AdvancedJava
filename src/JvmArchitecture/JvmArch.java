package JvmArchitecture;

public class JvmArch {
    public static void main(String[] args) {
        // Diamond Type Generic
        Shape<String> stringShape = new Shape<String>("Name", 17);


        Shape<Integer> integerShape = new Shape<>(17, 17);


        System.out.println("integer Shape results:");
        System.out.println(integerShape.getName() + " " + integerShape.getCircle());

        System.out.println("String shape Results");
        System.out.println(stringShape.getName() + "" + stringShape.getCircle());

    }
}

// Data lib is a perf killer
// İf you use that. Keep your mind.

class Shape<T> {
    private T Name;
    private int Circle;

    public Shape(T name, int circle) {
        Name = name;
        Circle = circle;
    }

    public T getName() {
        return Name;
    }

    public void setName(T name) {
        Name = name;
    }

    public int getCircle() {
        return Circle;
    }

    public void setCircle(int circle) {
        Circle = circle;
    }
}