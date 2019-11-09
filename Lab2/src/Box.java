public class Box {

    int height,width,depth;

    public Box(){

        height = 1;
        width = 1;
        depth = 1;
    }

    public Box(int n){

        height = n;
        width = n;
        depth = n;
    }

    public Box(int h, int w, int d){

        this.height = h;
        this.width = w;
        this.depth = d;

    }

    public void printinfo() {
        System.out.println("Weight - " + height + "\nWidth - " + width + "\nDepth - " + depth);
        }


    public int surface() {
        return (width * height)*2 + (width*depth)*2 + (depth*height)*2;
    }

    public int volume() {
        return depth * width * height;
    }

}
