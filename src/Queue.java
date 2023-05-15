public class Queue implements DataStructure{

    int count;
    int nextget;
    int nextput = 0;


    Object[] objects = new Object[100];
    // Methods
 public boolean put(Object obj) {
     if (count < 100){
         objects[nextput] = obj;
     nextput = nextput + 1;
     count = count + 1;
     return true;
 } else{
     return false;
    }
  public Object get(){
     Object obj = objects[nextget];

     return obj;
   }






}
