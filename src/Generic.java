import java.util.ArrayList;

public class Generic <T extends  Comparable> {
    //region CONSIGNAS
         /*1) Generar una clase con generics que contenga un array como atributo y en base a este
             array implemente metodos para obtener la siguiente informacion :
             a) Verificar si un objeto existe en el array
             b) Devolver el máximo
             c) Devolver el mínimo
             Recordar que para poder comparar dos objetos, la clase del objeto debe implementar la interfaz Comparable

         2) Agregar un metodo para eliminar el ultimo objeto del array y lo
         devuelva por parametro (Investigar la clase Arrays).

        */
    //endregion

    //region PROPIEDADES
    private ArrayList<T> list;
    //endregion

    //region CONSTRUCTORES
    public Generic(){
        this.list = new ArrayList<T>();
    }
    //endregion

    //region Ejercicio 1
    public boolean ExisteEsteObjeto(T item){
        return this.list.contains(item);
    }

    public T Max(){

        T ans = this.list.get(0);
        if(!this.list.isEmpty()){
            for (T e:this.list) {
                if(e.compareTo(ans)<0){
                    ans = e;
                }
            }
        }
        return  ans;
    }

    public  T Min(){
        T ans = this.list.get(0);
        if(!this.list.isEmpty()){
            for (T e: this.list) {
                if(e.compareTo(ans)>0){
                    ans = e ;
                }
            }
        }
        return  ans;
    }



    //endregion

    //region Ejercicio 2

    public void Add(T item){
        this.list.add(item);
    }

    public T RemoveLastItem(){
       T aux = this.list.get(list.size()-1);
       this.list.remove(list.size()-1);
       return  aux;
    }
    //endregion
}
