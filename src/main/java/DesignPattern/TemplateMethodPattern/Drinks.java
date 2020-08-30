package DesignPattern.TemplateMethodPattern;

public abstract class Drinks {
    public final void prepareDrinks()
    {
        boilWater();
        brew();
        pouringDrinks();
        if(needExtraToppings())
            addExtraToppings();
        preparedDrink();
    }

    private void boilWater()
    {
        System.out.println("Boiling Water...");
    }

    //하위 클래스에서 반드시 재정의해야 하는 알고리즘 메소드
    protected abstract void brew();

    private final void pouringDrinks()
    {
        System.out.println("Pouring Drinks...");
    }

    //상황에 따라 서브 클래스에서 구현 가능한 훅 메소드
    protected boolean needExtraToppings()
    {
        return false;
    }

    protected void addExtraToppings() {}

    protected abstract void preparedDrink();
}
