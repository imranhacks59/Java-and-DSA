package oops;

public class practice {

    static int fact(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }

    static boolean prime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n=5;
        int ans = fact(n);
        System.out.println(ans);

        boolean primeNumber=prime(n);
        System.out.println(primeNumber );
    }
}
