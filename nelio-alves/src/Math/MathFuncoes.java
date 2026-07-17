package Math;

public class MathFuncoes{

    public void raizQuadrada(int x){
        double resultado = Math.sqrt(x);
        System.out.printf("A raiz quadrada de %d é: %.2f %n",x,resultado);
        System.out.println("——————————————————————————————");
    }

    public void elevadoAoQuadrado(int x,int y){
        double resultado = Math.pow(x,y);
        System.out.printf("%d elevado a %d é %.2f %n", x,y,resultado);
        System.out.println("——————————————————————————————");
    }

    public void valorAbsoluto(int x){
        int resultado = Math.abs(x);
        System.out.printf("O valor absoluto de %d é %d %n", x,resultado);
        System.out.println("——————————————————————————————");
    }

    public void arredondarNumero(double x){
        double resultado = (int)Math.round(x);
        System.out.printf("O valor arredondado de %s é %s %n",x,resultado);
        System.out.println("——————————————————————————————");
    }

    public void arredondarNumeroParaCima(double x){
        double resultado =  Math.ceil(x);
        System.out.printf("O numero %s arredondado para cima é %s %n",x,resultado);
    }

    public void arredondarNumeroParaBaixo(double x){
        double resultado = Math.floor(x);
        System.out.printf("O numero %s arredondado para baixo é %s",x,resultado);
    }
}