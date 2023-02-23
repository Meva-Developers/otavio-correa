package JavaUtilWrappersLambda;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];

        //criando um laço
        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;

        }

        for (int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
//            System.out.println(idades[3]);

        }

        System.out.println(idades[2]);
        System.out.println(idades[4]);
        System.out.println(idades[5]);



    }

}

