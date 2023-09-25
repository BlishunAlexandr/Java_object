package a1;

public class rectangle {
    private Integer width;
    private Integer height;


    public rectangle(){
        this.width = 5;
        this.height = 5;
    }

    public rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public Integer getWidth() {
        return width;
    }

    public void setName(Integer Width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int age) {
        this.height = height;
    }


    public int calculateArea(){
        return width * height;
    }

    public int calculatePerimeter(){
        return 2 * (width * height);
    }
}
