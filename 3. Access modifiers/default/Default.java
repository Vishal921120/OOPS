class Default{
    static class Student{
        int roll;
        int classNo;
        
        Student(int roll, int classNo){
            this.roll = roll;
            this.classNo = classNo;
        }

        void display(){
            System.out.print("Details " + roll + " " + classNo);
        }
    }

    public static void main(String[] args){
        Student s = new Student(5,4);
        s.display();
    }
}

// When no access modifier is specified for a class, method, or data member – 
// It is said to be having the default access modifier by default. 
// The data members, classes, or methods that are not declared using any access modifiers 
// i.e. having default access modifiers are accessible only within the same package.