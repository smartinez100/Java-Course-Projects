public class LandTract{
    private int width = 0;
    private int length = 0;

    public LandTract(int width, int length){
        this.width = width;
        this.length = length;
    }
    public LandTract(LandTract other){
        this.width = other.width;
        this.length = other.length;
    }
    
    public int getWidth(){
        return this.width;
    }
    public int getLength(){
        return this.length;
    }
    public int getArea(){
        return this.width * this.length;
    }
    public boolean equals(LandTract other){
        return this.getArea() == other.getArea();
    }
    public String toString(){
        return "Width: " + getWidth() + ", Length: " + getLength() + ", Area: " + getArea();
    }
}