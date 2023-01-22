class Solution {
    public static int solve(int N, int K, int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        
        ArrayList<Integer> factors=new ArrayList<>();
        for(int i=1;i*i<=sum;i++){
            if(sum%i==0){
                factors.add(i);
                if(i!=sum/i)
                    factors.add(sum/i);
            }
        }
        
        Collections.sort(factors, Collections.reverseOrder());
        
        for(int i=1;i<N;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        
        int ans=1;
        for(int i: factors){
            int count=0;
            for(int j=0;j<N;j++){
                if(arr[j]%i==0)
                    count++;
            }
            
            if(count>=K){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
