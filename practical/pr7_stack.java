package Design_Algo_Analysis.practical;
public class pr7_stack{
   

  
    public static int stack[]=new int[6];
    public static int top=0;
    
    
    public static  void push(int data){
       if(top==6){
        System.out.println("Stack is full");
       }
       else{
        stack[top]=data;
      //  System.out.print("\nPushed: "+ stack[top]);
        top++;
      }
    }
    public static int pop(){
       int data;
       if(isEmpty()){
        System.out.println("Stack is empty \n");
       }
       top--;
       data= stack[top];
       stack[top]=0 ;//-1
      return data;
    
    }
    
    // peek , we dont delete the top 
    public static int peek(){
        int data;
        data =stack[top-1];
        return data;
    }
    public static int size(){
      return top;
    }
    public static boolean isEmpty(){
      return top<=0;
    }
    public static void show(){
        System.out.println("My stack ");
        for(int el :stack){
            System.out.println(el + " ");
        }
        System.out.println("\n");
    }
    
     public static void main (String args[]){
        System.out.println("Stack implementation ");
      
          push(5);
          push(10);
        
          push(45);
          push(11);
          
          System.out.println("After pushing the data");
          show();
          System.out.println("\npop:"+pop());
          push (6);
          push(9);
          push(45);
          push(96); // not possible stack is full 
          push(4561);
          show();
          System.out.println("After pop of the data");
          show();
          System.out.println("\n peek: "+ peek());
         
          System.out.println("size is: "+ size());
          System.out.println(isEmpty()?"The Stack is Empty":"The Stack is not empty"); // ternary op 
    
     }
    
    
    }
