class PublicMod{
    // in this example, the Rectangle class has two public varibales , width and height , and a public 
    // method getArea() . these can be accessed from any class in the program. 
    public static class Rectangle{
        public int width;
        public int height;

        public Rectangle(int width, int height){
            this.width = width;
            this.height = height;
        }

        public void getArea(){
            System.out.print(width*height);
        }
    }

    public static void main(String[] args){
        Rectangle rect = new Rectangle(5,10);
        rect.getArea();
    }
}

// The public access modifier is specified using the keyword public. 

// The public access modifier has the widest scope among all other access modifiers.
// Classes, methods, or data members that are declared as public are accessible from everywhere in the program. 
// There is no restriction on the scope of public data members.