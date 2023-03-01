public class ArrayLinkedList <T>{
    private Node<T> head;
    private int currentSize;
 
    public ArrayLinkedList(){
        this.head=null;
        this.currentSize=0;
    }
    public ArrayLinkedList(Node<T> head){
        this.head=head;
        this.currentSize++;

    }
    
    public Node<T> getHead() {
        if (this.head==null)  throw new NullPointerException("There is no data.");
        return this.head;
    }
   public int getSize(){
    return this.currentSize;
   }

    public  boolean isEmpty(){
        if (head==null || currentSize==0) {
            //System.out.print("The list is empty.");
            return true;
        }
        return false;
    }




    public void insert(T data)
    {   Node<T> newnode=new Node<T>(data);

       if(isEmpty()) {
        
        newnode.setnext(this.head);
     this.head=newnode;
        currentSize++;
       }
       else {
        
        newnode.setnext(this.head);
     this.head=newnode;
        currentSize++;
       }
   
 }
   
    public Node<T> deleteFirst(){
        if (getHead()==null)  return null;
        else if(currentSize==1){
            head=null;
            currentSize--;}
       else {
            this.head=getHead().getNext(); 
            currentSize--;
        }
        return head;
        


}


    public Node<T> deleteLast(){
        if(head==null){return null;}
        if(currentSize==1){return deleteFirst();}

        Node<T> current=this.getHead(),previous=null;
        while(current.getNext()!=null){
            previous=current;
            current=current.getNext();

        }
        previous.setnext(current);
        current=previous;
        currentSize--;
        return current;
        
    }


    public void  deleteAll(){
        this.head=null;
        this.currentSize=0;

    }
    public Node<T> delete(int index){
        Node<T> current=this.head;
        if (index > this.currentSize) {
            throw new IllegalArgumentException("Index is greater than length of the array list");
        }
        if(this.head == null || currentSize==0) throw new NullPointerException("There is no data.");

        if(index==0) return deleteFirst();
        if(index== currentSize) return deleteLast();

        for (int i = 1; i < index; i++) { //to go item ,before the one we have to delete (index-1)
         current=current.getNext();
       }
       Node<T> tmp=current.getNext();
       current.setnext(tmp.getNext());
       currentSize--;
       

        return tmp;
        
    }


    public void traversal(){
        Node<T> current =this.head;
        if(currentSize==0){System.out.print("There is nothing to show.");}
        if(current == null) throw new  NullPointerException();
        for (int i = 1; i <= currentSize; i++) {
            System.out.println(current.getData());
            current=current.getNext();
        }
    }

    public boolean find(T data){
        Node<T> current=this.head;
        if(currentSize==0){
            System.out.print("There is nothing to show.");
           }
        if(current == null) throw new  NullPointerException("There is no data");
        for (int i = 1; i <=currentSize; i++) {
            if (current.getData()==data) {
              return true;
            }
           
            current=current.getNext();
        }
        return false;
  
 
   
    }
}
    