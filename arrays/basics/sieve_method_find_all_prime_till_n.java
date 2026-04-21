    public static void sieve(int n){
        boolean[] isPrime = new boolean[n + 1];   
        // initially assume all are prime
        Arrays.fill(isPrime, true);    
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i * i <= n; i++){
            if(isPrime[i]){
                // mark multiples
                for(int j = i * i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        // print primes
        for(int i = 2; i <= n; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 20;
        sieve(n);
    }
