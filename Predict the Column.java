class Solution{
    int columnWithMaxZeros(int arr[][], int n){
        // code here 
        int col=-1;
        int max=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j][i]==0)
                    count++;
            }
            if(count>max){
                max=count;
                col=i;
            }
        }
        return col;
    }
}
