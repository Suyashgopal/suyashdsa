bool isPowerOfTwo(int n) {
    if(n<=0){
        return false;

    }

    int dig = n& (n-1);
    return (dig==0);
    
}