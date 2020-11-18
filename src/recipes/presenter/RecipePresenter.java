package recipes.presenter;

import java.sql.SQLException;
import java.util.List;
import recipes.model.IQueries;
import recipes.model.Recipe;
import recipes.view.IView;

public class RecipePresenter {
    private static IQueries queries;
    private static IView view ;
    
    //constructor for assigning recipes.model.IQueries object
    public RecipePresenter(IQueries q){
        queries = q;   
    }

    //method for assigning recipes.view.IView object
    public void bind(IView v){
        view = v;
    }
    
    //method to get list of recipes for a category
    public void recipesForCategory(String c) throws SQLException{
        List<Recipe> listCategory= queries.getRecipesForCategory(c);
        String category = "" ;
        for(Recipe recipe: listCategory){
            category += recipe.toString() + " \n";
        }
        view.setOutputTextArea(category);
    }
    
    //method to add a recipe
    public void addRecipe(String n, String c, String mi, int pt, int ct) throws SQLException{
        queries.addRecipe(n, c, mi, pt, ct);
        view.setOutputTextArea("The recipe is added");
    }
    
    //method to get list of recipes for a category and given range of processing time
    public void recipesForCategoryAndProcessingTime(String c, int t1, int t2) throws SQLException{
        List<Recipe> listCategoryPreparation= queries.getRecipesForCategoryAndProcessingTime(c, t1, t2);
        String categoryPreparation = "" ;
        for(Recipe recipe: listCategoryPreparation){
            categoryPreparation += recipe.toString() + " \n";
        }
        view.setOutputTextArea(categoryPreparation);
    }
    
    //method to get list of recipes for a particular main ingredient
    public void numberOfRecipesUsingMainIngredient(String mi) throws SQLException{
        int count = 0;
        List<Recipe> listMainIngredient = queries.getNumberOfRecipesUsingMainIngredient(mi);
        for(Recipe recipe: listMainIngredient){
            count ++;
        }
        view.setOutputTextArea(""+count);   
    }
    
    //method to get list of recipes for a category and given range of combined time
    public void recipesForCategoryAndCombinedTime(String c, int t1, int t2)throws SQLException{
        List<Recipe> listCategoryCombined= queries.getRecipesForCategoryAndCombinedTime(c, t1, t2);
        String categoryCombined = "" ;
        for(Recipe recipe: listCategoryCombined){
            categoryCombined += recipe.toString() + " \n";
        }
        view.setOutputTextArea(categoryCombined);   
    }
    
    //method to close the application and connection to database
    public void close(){
        queries.close();
        System.exit(0);
    }
    
    
}
