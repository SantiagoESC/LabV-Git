

public class Main {
    public static void main(String[] args) {

        Generic<String> countriesList = new Generic<String>();

        countriesList.Add("Argentina");
        countriesList.Add("Estados Unidos");
        countriesList.Add("Francia");

        System.out.println(countriesList.ExisteEsteObjeto("Italia"));
        System.out.println(countriesList.ExisteEsteObjeto("Argentina"));

        System.out.println("El Mas grande de los paises es: "+countriesList.Max() +" PAPAA !! ");
        System.out.println("El menor de los paises es: "+countriesList.Min());
        String answer = countriesList.RemoveLastItem();
        System.out.println("El pais que se elimino fue: "+answer);

        Stack<Integer> stackBuy = new Stack<Integer>();

        stackBuy.Push(125);
        stackBuy.Push(245);
        stackBuy.Push(45);
        stackBuy.Push(684);

        System.out.println("La base es : "+stackBuy.getBase());
        System.out.println("El tope es : "+stackBuy.getTop());

        System.out.println("El tamaño de la pila es : "+stackBuy.Size());
    }
}
