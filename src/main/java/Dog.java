public class Dog {
    int max(int a, int b){
        return a > b ? a :b;
    }

    boolean isPrime(int n){
        for(int i=2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return  true;
    }
}
