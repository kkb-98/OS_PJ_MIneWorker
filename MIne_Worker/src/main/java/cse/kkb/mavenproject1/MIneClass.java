package cse.kkb.mavenproject1;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MIneClass implements Runnable {
    int n;
    public MIneClass(int n2){
        n=n2;
    }
    
    public void run(){
        System.out.println("스레드가 생성되었습니다.");
        System.out.println("광부투입.");
        
        for(int i = 1; i<=3; i++){
        try {
            System.out.println("채굴중, 스레드 작업중");
            n+=1;
            Thread.sleep(1000);
            if (i==3){
                break;
            }
            else{
                System.out.println("휴식");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MIneClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        System.out.println("광부퇴근.");
        System.out.println("스레드가 종료되었습니다.");
        System.out.println("채굴량:"+n);
        System.out.println("깃허브 어서와!");
    }
}
