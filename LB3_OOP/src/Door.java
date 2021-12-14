public class Door {
    String material;
    int height;
    int width;
    String color;
    boolean open;
    boolean close;

    public Door(String material, int height, int width, String color) {
        this.material = material;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public Door(boolean open) {
        this.open = open;
    }

    void open() {
        open = true;
    }

    void close() {
        close = true;
    }

    void paint(String color) {
        this.color = color;
    }

    void size(int height, int width) {
        this.height = height;
        this.width = width;
    }
}
