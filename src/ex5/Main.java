package ex5;

//Crie uma classe Data. A classe conterá, além dos construtores que você considera apropriados,
//métodos de acesso e o método toString, conforme explicamos no exercício anterior, um método para verificar
//se a data está correta e outro para adicionar um dia ao valor atual da data.
//A classe GregorianCalendar deve ser investigada e usada para implementar os construtores e métodos Date.

public class Main {
    public static void main(String[] args) {
        Data data = new Data(28, 1, 1999);
        Data data1 = new Data(31, 12, 1999);
        Data data2 = new Data(40, 21, -2);
//        data.adicionarDia();
        System.out.println(data);

//        data1.adicionarDia();
//        System.out.println(data1);
//        System.out.println(data2.verificarData());
    }
}
