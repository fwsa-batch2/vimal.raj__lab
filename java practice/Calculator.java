public class Calculator {
    public static void main(String[] args) {
        int add=add(7,8);
        int sub=sub(10,3);
        int mul=mul(10,3);
        int div=div(10,2);//parameter
        float adding=add1(10.555,10.9f); //need to use f while using float
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(adding);

    }
    public static int add(int x,int y){ //when called it substitute the value given by user to this method
        int adding = x+y;               //example adding = num1+num2,15=7+8
        return adding;
    }

    public static int sub(int x,int y){
        int subraction = x-y;
        return subraction;
    }

    public static int mul(int x,int y){
        int multipilication = x*y;
        return multipilication;
    }

    public static int div(int x,int y){
        int divition =x/y;
        return divition;
    }

    public static float add1(double d,float y){
        float addition = (float) (d+y);
        return addition;
    }

     
   
}
