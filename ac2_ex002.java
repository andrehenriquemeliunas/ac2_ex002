import java.util.Scanner;
public class ac2_ex002{
    public static void main( String[] args){
        int psico, legis, dire;//Declara as variáveis

        Scanner s = new Scanner( System.in);
        System.out.println("Você foi aprovado no exame PSICOTÉCNICO? Digite 1 para SIM, e 2 para NÃO");//Nessa etapa eu verifiquei se o usuário passou no exame psicotécnico
        psico = s.nextInt();//Salva a resposta do usuário

        System.out.println("Você foi aprovado no exame de LEGISLAÇÃO? Digite 1 para SIM, e 2 para NÃO");//Nessa etapa eu verifiquei se o usuário passou no exame de legislaçãp
        legis = s.nextInt();//Salva a resposta do usuário

        System.out.println("Você foi aprovado no exame de DIREÇÃO? Digite 1 para SIM, e 2 para NÃO");//Nessa etapa eu verifiquei se o usuário passou no exame de direção
        dire = s.nextInt();//Salva a resposta do usuário

        if(psico == 1 && legis == 1 && dire == 1){//Condicional na qual todas tem que ser Verdadeiras
            System.out.print("Você foi APROVADO!");//Se a condição for satisfeita
        }else{
            System.out.print("Você foi REPROVADO!");//Se a condição não for satisfeita
        }

        s.close();
    }
}