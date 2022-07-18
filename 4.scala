def main(args:Array[String])={

    def bookprice(x:Int):Double = x*24.95;
    def discount(y:Double):Double = y*0.4;
    def shippingcost(z:Int):Double = 3*z + (z-50)*0.75;

    println(bookprice(60)-discount(bookprice(60))+shippingcost(60));
    
}
