import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        //Exercicio Quantos anos tenho
        System.out.println("Vou advinhar quantos anos tens!\nIntroduz o teu ano de nascimento:");
        int anoNascimento = keyboard.nextInt();
        System.out.println("Tens " + dataNascimento(anoNascimento) + " anos.");

        // Exercicio Qual é o teu signo
        signoZodiaco();

        // Exercicio Ordenar 3 numeros por ordem crescente
        ordemCrescente();
    }

    // _________________  Exercicio Quantos anos tenho ________________
    static int dataNascimento(int ano){
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        return anoAtual - ano;
    }

    // _________________ Exercicio Qual é o teu signo ________________
    public static void signoZodiaco(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Em que dia nasceste?");
        int dia = keyboard.nextInt();

        System.out.println("Em que mês nasceste?");
        int mes = keyboard.nextInt();

        System.out.println("O teu signo é " + mesAno(mes,dia));

    }

    public static String mesAno(int mes, int dia){

        if((mes < 1 || mes > 12) || (dia < 1 || dia > 31)){
            return "Dia ou Mes incorreto";
        } else if((mes == 12 && dia >= 22) || (mes == 1 && dia < 20)) {
            return "Capricornio";
        } else if((mes == 1 && dia >= 20) || (mes == 2 && dia < 19)) {
            return "Aquario";
        } else if((mes == 2 && dia >= 19) || (mes == 3 && dia < 21)) {
            return "Peixes";
        } else if((mes == 3 && dia >= 21) || (mes == 4 && dia < 20)) {
            return "Aires";
        } else if((mes == 4 && dia >= 20) || (mes == 5 && dia < 21)) {
            return "Touro";
        } else if((mes == 5 && dia >= 21) || (mes == 6 && dia < 21)) {
            return "Gemeos";
        } else if((mes == 6 && dia >= 21) || (mes == 7 && dia < 23)) {
            return "Cancer";
        } else if((mes == 7 && dia >= 23) || (mes == 8 && dia < 23)) {
            return "Leão";
        } else if((mes == 8 && dia >= 23) || (mes == 9 && dia < 23)) {
            return "Virgem";
        } else if((mes == 9 && dia >= 23) || (mes == 10 && dia < 23)) {
            return "Libra";
        } else if((mes == 10 && dia >= 23) || (mes == 11 && dia < 22)) {
            return "Escorpião";
        } else if((mes == 11 && dia >= 22) || (mes == 12 && dia < 22)) {
            return "sagitário";
        } else {
            return "Dia ou Mes incorreto";
        }
    }

    // _________________ Exercicio Ordenar 3 numeros por ordem crescente ________________
    public  static void ordemCrescente() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nIntroduza 1º numero:");
        int num01 = keyboard.nextInt();
        System.out.println("Introduza 2º numero:");
        int num02 = keyboard.nextInt();
        System.out.println("Introduza 3º numero:");
        int num03 = keyboard.nextInt();

        int posicao01 = Math.min(Math.min(num01,num02),num03);
        int posicao02 = Math.max(Math.min(num01,num02),Math.min(num02,num03));
        int posicao03 = Math.max(Math.max(num01,num02),num03);

        System.out.println("Numero por ordem crescente " + posicao01 + ", " + posicao02 + ", " + posicao03);

    }
}
