package recipes.model;

//Class Recipe
public class Recipe {
    
    private String category;
    private int cookingTime;
    private int id;
    private String mainIngredient;
    private String name;
    private int preparationTime;
    
    //Parameterisesd constructor for class Recipe
    public Recipe(int id, String n, String c, String mi, int pt, int ct){
        this.name = n;
        this.id = id;
        this.category= c;
        this.mainIngredient = mi;
        this.cookingTime = ct;
        this.preparationTime = pt;
    }
    
    //setter methods
    public void setCategory(String c){
        this.category = c;
    }
    
    public void setCookingTime(int ct){
        this.cookingTime = ct;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setMainIngredient(String mi){
        this.mainIngredient = mi;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public void setPreparationTime(int pt){
        this.preparationTime = pt;
    }
    
    
    
    //getter methods
    public String getCategory(){
        return category;
    }
    
    public int getCookingTime(){
        return cookingTime;
    }
    
    public int getId(){
        return id;
    }
    
    public String getMainIngredient(){
        return mainIngredient;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPreparationTime(){
        return preparationTime;
    }
    
    
    
    //toString
    @Override
    public String toString(){
        
        String recipe = id+ " , " + name+ " , " + category+ " , " + mainIngredient+ " , " + preparationTime+ " , " + cookingTime;
        return recipe;
    }
}
