package Ex4;

public interface adder <T extends Number>{
    T zero(); //this will add zero items
    T add(T lhs, T rhs); //adding 2 items
}
