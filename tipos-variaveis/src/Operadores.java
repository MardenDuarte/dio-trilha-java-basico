public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        //x repetição 
        int numero = 5;
        numero++;
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "falso";
        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUM é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUM é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUM é Maior que numeroDois? " + simNao);


    }

}
