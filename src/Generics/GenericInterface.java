package Generics;

public interface GenericInterface <T>{

    public boolean insert(T data);
    public boolean delete(T data);
    public boolean update(T data);
    public T select();
}
