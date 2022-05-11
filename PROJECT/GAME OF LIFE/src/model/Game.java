
package jeudelavie.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author baptistesaintleger
 */
public class Game{
    int dim;
    public Boolean[][] tab;
    public Boolean[][] newTab;
    
    private final IntegerProperty mortSolitude = new SimpleIntegerProperty(0);
    private final IntegerProperty mortAsphyxie = new SimpleIntegerProperty(0);
    private final IntegerProperty vieMin = new SimpleIntegerProperty(0);
    private final IntegerProperty vieMax = new SimpleIntegerProperty(0);
    
    public Game(int dimension, IntegerProperty mortSolitude, IntegerProperty mortAsphyxie, IntegerProperty vieMin, IntegerProperty vieMax)
    {
        dim = dimension;
        tab = new Boolean[dim+2][dim+2];
        newTab = new Boolean[dim+2][dim+2];
        
        for(int i = 0; i <= dim + 1; i++)
        {
            for(int j = 0; j <= dim + 1; j++)
            {
                tab[j][i] = false;
                newTab[j][i] = false;
            }
        }
        
        this.mortSolitude.bind(mortSolitude);
        this.mortAsphyxie.bind(mortAsphyxie);
        this.vieMin.bind(vieMin);
        this.vieMax.bind(vieMax);
    }
    
    public Game(int dimension, IntegerProperty mortSolitude, IntegerProperty mortAsphyxie, IntegerProperty vieMin, IntegerProperty vieMax, double proba)
    {
        dim = dimension;
        tab = new Boolean[dim+2][dim+2];
        newTab = new Boolean[dim+2][dim+2];
        for(int i = 0; i <= dim + 1; i++)
        {
            for(int j = 0; j <= dim + 1; j++)
            {
                if(j == 0 || i == 0 || j == dim+1 || i == dim+1)
                {
                    tab[j][i] = false;
                    newTab[j][i] = false;
                }
                else 
                {
                    double n = Math.random();
                    if(n <= proba)
                    {
                        tab[j][i] = true;
                        newTab[j][i] = true;
                    }
                    else
                    {
                        tab[j][i] = false;
                        newTab[j][i] = false;
                    }
                } 
            }
        }
        
        this.mortSolitude.bind(mortSolitude);
        this.mortAsphyxie.bind(mortAsphyxie);
        this.vieMin.bind(vieMin);
        this.vieMax.bind(vieMax);
    }
    
    public int countNeighbors(int i, int j)             //compte le nombre de voisin d'une coordonnée
    {
        int nb = 0;
        
        nb += tab[i][j+1] ? 1 : 0;
        nb += tab[i][j-1] ? 1 : 0;
        nb += tab[i-1][j-1] ? 1 : 0;
        nb += tab[i-1][j] ? 1 : 0;
        nb += tab[i-1][j+1] ? 1 : 0;
        nb += tab[i+1][j-1] ? 1 : 0;
        nb += tab[i+1][j] ? 1 : 0;
        nb += tab[i+1][j+1] ? 1 : 0;
        return nb;
    }
    
    public void update()                                //mise à jour de létat du jeu à un temps T + 1
    {
        
        for(int i = 1; i <= dim; i++)
        {
            for(int j = 1; j <= dim; j++)
            {
                int n = countNeighbors(j, i);
                if(tab[j][i])
                {
                    if(n <= mortSolitude.get() || n >= mortAsphyxie.get())
                        newTab[j][i] = false;
                    else
                        newTab[j][i] = true;
                }
                else {
                    if(n >= vieMin.get() && n <= vieMax.get())
                        newTab[j][i] = true;
                }
            }
        }
        for(int i = 1; i <= dim; i++)
        {
            for(int j = 1; j <= dim; j++)
            {
                tab[j][i] = newTab[j][i];
            }
        }
    }
    
    public void resetNewTab()                       //mise à zéro de newTab
    {
        for(int i = 0; i <= dim + 1; i++)
        {
            for(int j = 0; j <= dim  + 1; j++)
            {
                newTab[j][i] = false;
            }
        }
    }
    
    public void extend(int newDim)                  //redimensionne la game
    {
        if(newDim < dim)
            System.out.println("Erreur dimension trop petite");
        if(newDim == dim)
            System.out.println("Pas besoin de redimensionner");
        else
        {
            newTab = new Boolean[newDim+2][newDim+2];
            
            for(int i = 0; i <= newDim + 1; i++)
            {
                for(int j = 0; j <= newDim + 1; j++)
                {
                    newTab[j][i] = false;
                }
            }
            
            
            int n = (newDim - dim)/2;
            for(int i = n; i <= n+dim; i++)
            {
                for(int j = n ; j <= n+dim; j++)
                {
                    newTab[j][i] = tab[j-n+1][i-n+1];
                }
            }
            
            tab = new Boolean[newDim+2][newDim+2];
            
            for(int i = 0; i <= newDim+1; i++)
            {
                for(int j = 0; j <= newDim+1; j++)
                {
                    tab[j][i] = newTab[j][i];
                }
            }
            
            dim = newDim;
            resetNewTab();
        }
    }
    
    public void drawTampon(int x, int y, Game g)        //rajoute le tampon selon des coordonées
    {
        if(g.dim < dim && x+g.dim < dim && y+g.dim < dim)
        {
            for(int i = y; i <= g.dim + y; i++)
            {
                for(int j = x; j <= g.dim + x; j++)
                {
                    tab[j][i] = g.tab[j-x][i-y];
                }
            }
        }
    }
    
    public void print()                             //affiche tab
    {
        for(int i = 0; i <= dim + 1; i++)
        {
            System.out.println();
            for(int j = 0; j <= dim + 1; j++)
            {
                System.out.print(" " + tab[j][i]);
            }
        }
        System.out.println();
    }
}
