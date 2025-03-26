abstract public class Beverage {
    private void TakeGlass(){
        System.out.println("Take Glass");
    }
    private void PoureIntoCup(int quantity,String name){
        System.out.println("Pouring "+quantity+"ml of "+name+" into cup");
    }
    protected abstract void AddIngredient();
    protected void Stirring(){} // This is hook function
    protected void Serve(){
        System.out.println("Waiter is serving the drink");
    }
    public void MakeDrink(int quantity,String name){
        TakeGlass();
        PoureIntoCup(quantity,name);
        AddIngredient();
        Stirring();
        Serve();
    }
}

