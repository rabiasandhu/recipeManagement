package recipes.model;

import java.util.List;
import java.sql.SQLException;

public interface IQueries {
    
    public int addRecipe(String n, String c, String mi, int pt, int ct) throws SQLException;
    
    public List<Recipe> getRecipesForCategory(String c) throws SQLException;
    
    public List<Recipe> getRecipesForCategoryAndProcessingTime(String c, int t1, int t2) throws SQLException;
    
    public List<Recipe> getNumberOfRecipesUsingMainIngredient(String mi) throws SQLException;
    
    public List<Recipe> getRecipesForCategoryAndCombinedTime(String c, int t1, int t2) throws SQLException;
    
    public void close();
    
}
