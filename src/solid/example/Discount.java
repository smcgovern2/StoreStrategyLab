package solid.example;

public interface Discount {
    double getDiscount();
}


class DiscountD implements Discount{
    public double getDiscount(){
        return 0.5;
    }
}

class DiscountS implements Discount{
    public double getDiscount(){
        return 0.1;
    }
}

class DiscountL implements Discount{
    public double getDiscount(){
        return 0.75;
    }
}

class DiscountNone implements Discount{
    public double getDiscount(){
        return 0.0;
    }
}