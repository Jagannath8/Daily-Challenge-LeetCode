class Solution {
    public int[] getOrder(int[][] tasks) {
        int allTasks[][]=new int[tasks.length][3];
        Queue<int[]> minHeap=new PriorityQueue<>((a,b) -> a[2]-b[2]==0 ? a[0]-b[0] : a[2]-b[2]);

        for(int i=0;i<tasks.length;i++){
            allTasks[i][0]=i;
            allTasks[i][1]=tasks[i][0];
            allTasks[i][2]=tasks[i][1];
        }

        Arrays.sort(allTasks, (a,b) -> a[1]-b[1]);
        int i=0, index=0, currTime=0;
        int result[]=new int[tasks.length];

        while(i<tasks.length){
            while(i<tasks.length && currTime>=allTasks[i][1]){
                minHeap.add(allTasks[i++]);
            }

            if(minHeap.isEmpty()){
                currTime=allTasks[i][1];
            }

            if(!minHeap.isEmpty()){
                int currTask[]=minHeap.poll();
                result[index++]=currTask[0];
                currTime+=currTask[2];
            }
        }

        while(!minHeap.isEmpty()){
            int currTask[]=minHeap.poll();
            result[index++]=currTask[0];
        }
        
        return result;
    }
}
