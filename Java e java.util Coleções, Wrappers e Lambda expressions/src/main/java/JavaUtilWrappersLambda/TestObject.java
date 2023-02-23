package JavaUtilWrappersLambda;

public class TestObject {

    //Array[] é uma estrutura de dados e é um objeto, por isso precisa do new. 
    public static void main(String[] args) {

        int [] idades = new int[5];

         idades[0] = 10;
         idades[1]=  20;
         idades[2] = 30;
         idades[3] = 40;
         idades[4] = 50;

         int idade = idades[0];

        System.out.println(idade);
        System.out.println(idades.length);

    }

}


