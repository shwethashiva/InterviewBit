public class MathSolutions {
    public String DecimalToBinary(int A){
        StringBuilder sb=new StringBuilder();
        if(A<=0)return Integer.toString(A);
        int rem=0;
        while(A<0){
            rem=A%2;
            sb.append(Integer.toString(rem));
            A=A/2;
        }
        return sb.reverse().toString();

    }
    public static void main(String [] args){
        MathSolutions math= new MathSolutions();
        int A=100;
        String res=math.DecimalToBinary(A);
        System.out.println("Answer is "+ res);
    }
}
