
public class whisky extends Beverage{
    @Override
    protected void AddIngredient() {
        System.out.println("Adding Soda Water");
    }
    @Override
    protected void Stirring() {
        System.out.println("Stirring");
    }
    // private void PoureIntoCup(){
    //     System.out.println("Pouring into cup");
    // }
    // private void AddIceWater(){
    //     System.out.println("Adding ice water");
    // }   
    // private void AddWhisky(){
    //     System.out.println("Adding whisky");
    // }
    // private void AddStir(){
    //     System.out.println("Stirring");
    // }
    // public void MakeDrink(){
    //     System.out.println("Making whisky");
    //     System.out.println("Take Glass");
    //     PoureIntoCup();
    //     AddIceWater();
    //     AddWhisky();
    //     AddStir();
    //     System.out.println("Drink is ready");
    // }

}
