import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ValidarAssunto extends Thread{
    public static Validar vv = new Validar();
    String nomeAluno;

    public ValidarAssunto(String nome){
        this.nomeAluno = nome;

    };

    public void run(){
        String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( this.nomeAluno + " está na fila para validar o assunto. " + timeStamp);
        System.out.println("----------------------------------------");
        vv.Validacao(this.nomeAluno);
        

    }
    
};
