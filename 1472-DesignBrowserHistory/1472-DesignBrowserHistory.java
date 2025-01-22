class Node{
    String data;
    Node next;
    Node prev;

    Node(){
        this.data="0";
        this.next=null;
        this.prev=null;
    }
    Node(String data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    Node(String data,Node next,Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}
class BrowserHistory {
    Node cur;
    public BrowserHistory(String homepage) {
        cur=new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode =new Node(url);
        cur.next=newNode;
        newNode.prev=cur;
        cur=newNode;
    }
    
    public String back(int steps) {
        while(steps!=0){
            if(cur.prev!=null){
                cur=cur.prev;
                steps--;
            }
            else{
                break;
            }
        }
        return cur.data;
    }
    
    public String forward(int steps) {
        while(steps!=0){
            if(cur.next!=null){
                cur=cur.next;
                steps--;
            }
            else{
                break;
            }
        }
        return cur.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */