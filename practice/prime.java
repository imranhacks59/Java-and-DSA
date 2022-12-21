public class prime {

    static boolean prime(int n){
        if(n==1)
            return false;
        for(int i=2;i<n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n1=20;
        int n2 = 100;
        for(int i=n1;i<=n2;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
