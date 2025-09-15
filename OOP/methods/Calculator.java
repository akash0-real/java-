package OOP.methods;

public class Calculator {
    public static void main(String[] args) {
        Sum one = new Sum();
        System.out.println(one.display(1,2));
        System.out.println(one.display(1,2,3));
        System.out.println(one.display(10.2,23.5));
        int[] arr = {1,2,3,4,5};
        System.out.println(one.display(arr));
        
    }
    
}

class Sum{
    int display(int a,int b){
        return a+b;
    }
    int display(int a,int b,int c){
        return a+b+c;
    }
    double display(double num1,double num2){
        return num1+num2;
    }

    int display(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

}