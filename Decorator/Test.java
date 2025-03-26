class Test{
    public static void main(String args[]){
        Offering offering =  new Coffee();
        offering = new Rum(offering);
        offering = new Rum(offering);
        System.out.println(offering.getname()+" "+offering.getprice());
        
    }
}