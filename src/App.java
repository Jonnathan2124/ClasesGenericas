public class App {
    public static void main(String[] args) throws Exception {
        ClasesGenericas<Producto> articulos = new ClasesGenericas<>();

        articulos.agregarElemento(new Producto( 1, " laptop"));
        articulos.agregarElemento(new Producto( 2, " teclado"));
        articulos.agregarElemento(new Producto( 3, " mouse"));

        System.out.println("Lista de productos:");
        for (Producto productos : articulos.obtenerElementos()) {
            System.out.println(productos);
        }

        articulos.eliminarElemento(new Producto( 2," teclado"));
        System.out.println("\nDespués de eliminar el producto con id 2:");
        System.out.println(articulos);
    }
}
