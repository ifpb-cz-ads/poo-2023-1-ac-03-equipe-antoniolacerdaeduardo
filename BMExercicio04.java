public class BMExercicio04 {
    public static void main(String[] args){
        
        long long1 = 100;
        int int1;
        int int2;

        int1 = 200;
        //int2 = int1 + long1; O código não é possível pois, sempre que temos um calculo matemático entre uma variável do tipo int e long, a conversão atualiza o valor para o maior tipo, no caso, o tipo long. Porém, em Java não é possível converter uma variável de tipo int para long, por isso gerou erro.
        int2 = (int1 + (int)long1); //Para concertar o erro, basta converter o tipo do valor de long1 para int antes da atribuição a variável int2;
    
    }
}
