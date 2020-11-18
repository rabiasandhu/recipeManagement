package recipes;

import recipes.model.RecipeQueries;
import recipes.presenter.RecipePresenter;
import recipes.view.RecipeView;

public class Recipes {

    public static void main(String[] args) {
        
        //creating object for class recipes.model.RecipeQueries
        RecipeQueries rq = new RecipeQueries();
        
        //creating object for class recipes.presenter.RecipePresenter
        RecipePresenter rp = new RecipePresenter(rq);
        
        //creating object for class recipes.view.RecipeView
        RecipeView rv = new RecipeView(rp); 
        
        //binding RecipePresenter object with RecipeView object
        rp.bind(rv);
                
    }
    
}
