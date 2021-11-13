package case13;

public class Block{
    private int width;
    private int length;
    private int height;

    public Block(int arr[]){
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
    public int getVolume() {
        return height*length*width;
    }
    public int getSurfaceArea() {
        int surfaceArea=(height*length*2)+(height*width*2)+(length*width*2);

        return surfaceArea;
    }


    // Good Luck!
}
