public class Association<K, V> {
    K key;
    V valor;
 
    public void addAsociation(K key, V valor){
        this.key = key;
        this.valor = valor;
    }

    public K getKey(){
        return this.key;
    }

    public V getValor(){
        return this.valor;
    }
}
