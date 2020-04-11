public int length(){ 
    int count=0; 
    Node current = this.head;

     while(current != null){ 
         count++; 
         current=current.next() 
         } return count; 
    }

    //Recursively

    public int length(Node current){ 
        if(current == null){ //base case 
        return 0; 
        } 
        return 1+length(current.next());
    }

Read more: https://javarevisited.blogspot.com/2016/05/how-do-you-find-length-of-singly-linked.html#ixzz6IwvsuzLP

