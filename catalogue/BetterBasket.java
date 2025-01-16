package catalogue;

import debug.DEBUG;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket
{

  @Override
  public boolean add( Product pr )
  {

    for(Product prInlist: this){
      if(prInlist.getProductNum().equals(pr.getProductNum())){// if the new item added has the same product number
        int quantity = pr.getQuantity()+prInlist.getQuantity();//adds the new number to quantity
        prInlist.setQuantity(quantity);//sets the list item to quantity
        this.sort();

        return(true);

      }
    }
    return super.add( pr );     // Call add in ArrayList
  }

  }

  // You need to add code here
  // merge the items for same product,
  // or sort the item based on the product number

