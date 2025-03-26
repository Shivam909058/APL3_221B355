
public class Rum extends Beverage {
    @Override
    protected void AddIngredient() {
        System.out.println("Adding Ice");
    }
    @Override
    protected void Stirring() {
        System.out.println("Stirring");
    }
    // private void PoureIntoCup(){
    //     System.out.println("Pouring into cup");
    // }
    // private void AddSodaWater(){
    //     System.out.println("Adding soda water");
    // }
    // private void AddSugar(){
    //     System.out.println("Adding sugar");
    // }
    // private void AddRum(){
    //     System.out.println("Adding rum");
    // }
    // private void AddStir(){
    //     System.out.println("Stirring");
    // }
    // public void MakeDrink(){
    //     System.out.println("Making rum");
    //     System.out.println("Take Glass");
    //     PoureIntoCup();
    //     AddSodaWater();
    //     AddSugar();
    //     AddRum();
    //     AddStir();
    //     System.out.println("Drink is ready");
    // }
}
