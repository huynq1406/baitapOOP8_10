// Lớp MainProgram.java
import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        // Khởi tạo các hình
        shapes.add(new Rectangle(new Point(2, 4), 4, 6));
        shapes.add(new Square(new Point(0, 1), 6));
        shapes.add(new Circle(new Point(5, 3), 4));

        // Đếm số lượng hình đã khởi tạo
        System.out.print("Số lượng hình đã khởi tạo: " + Shape.getShapeCount() + '\n');

        // Danh sách các hình đã khởi tao
        System.out.println("Danh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.print(" - " + s.getInfo() + '\n');
        }

        // Danh sách tâm điểm
        System.out.println("Danh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(" - " + s.getCenterPoint());
        }
    }
}
