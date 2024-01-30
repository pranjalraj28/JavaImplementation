import java.util.LinkedList;

class SharedBuffer{
    private final int capacity;
    private final LinkedList<Integer> buffer;

    public  SharedBuffer(int capacity){
        this.capacity = capacity;
        this.buffer = new LinkedList<>();
     }

     public synchronized void produce(int item){
        while(buffer.size() == capacity){
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        buffer.add(item);
        System.out.println("Produce:"+item);
        notifyAll();
        }
        public synchronized void consume(){
            while(buffer.isEmpty()){
                try{
                    wait();
                }
                catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            int item= buffer.remove();
            System.out.println("Consume:"+item);
            notifyAll();

     }
}

class Producer extends Thread{
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            buffer.produce(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread{
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            buffer.consume();
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(3);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
