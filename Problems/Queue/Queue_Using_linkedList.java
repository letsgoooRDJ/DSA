
/*The structure of the node of the queue is*/
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}

class MyQueue
{
    QueueNode front, rear;
    boolean isEmpty(){
        return front == null;
    }
    //Function to push an element into the queue.
	void push(int a)
	{
	    QueueNode temp = new QueueNode(a);
	    
	    if(isEmpty()){
	        front = temp;
	        rear =temp;
	    }else{
	        if(temp != null){
	            rear.next = temp;
	            rear = temp;
	        }
	    }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
    // Your code here
	    if(isEmpty()){
	        return -1;
	    }else{
	        int val = front.data;
	        front = front.next;
	        if(front == null){
	            rear = null;
	        }
	        return val;
	    }
        
	}
}

