class BrowserHistory {
    List<String> li;
    int total=0, curr=0;
    public BrowserHistory(String homepage) {
        li=new ArrayList<String>();
        li.add(homepage);
        total++;
        curr++;
    }
    
    public void visit(String url) {
        if(li.size()>curr)
            li.set(curr, url);
        else
            li.add(url);
        
        curr++;
        total=curr;
    }
    
    public String back(int steps) {
        curr=Math.max(1, curr-steps);
        return li.get(curr-1);
    }
    
    public String forward(int steps) {
        curr=Math.min(total, curr+steps);
        return li.get(curr-1);
    }
}
