import java.util.Random;

public class Validar {

    boolean Validado;
    int NumeroValido;
    int tentativas;

   synchronized void Validacao(String nome){

    System.out.println(nome + " está validando o assunto.");
    try {
        Thread.sleep(100);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        Random rand = new Random();
        this.NumeroValido = 42;
        this.Validado = false;
        this.tentativas = 0;
        while(!this.Validado){
            this.tentativas +=1;
            int numeroAluno = rand.nextInt(100);
            this.Validado = numeroAluno == this.NumeroValido? true:false;
            if(this.tentativas == 10){
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(this.Validado){
            System.out.println(nome + " validou com 100%.");

        } else{ System.out.println(nome + " validou com 50%."); };
        System.out.println("----------------------------------------");

    }


}