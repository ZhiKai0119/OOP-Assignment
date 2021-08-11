
package CardDisplay;


import javax.swing.*;

/**
 *
 * @author Acer
 */
public class Product_Card {
    private Icon icon;
    private String title, description;
    
    public Product_Card(){
        
    }

    public Product_Card(Icon icon, String title, String description) {
        this.icon = icon;
        this.title = title;
        this.description = description;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

}
