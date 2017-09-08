package lesson5.labs.prob1.rulesets;

import lesson5.labs.prob1.gui.CDWindow;

import java.awt.Component;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		CDWindow cdWindow = (CDWindow)ob;

		String titleValue = cdWindow.getTitleValue();
		String artistValue = cdWindow.getArtistValue();
		String priceValue = cdWindow.getPriceValue();

        if(artistValue.trim().isEmpty() || titleValue.trim().isEmpty() || priceValue.trim().isEmpty()) {
            throw new RuleException("All fields must be nonempty");
        }

        int idx = priceValue.indexOf(".");

        if(idx == -1 || (priceValue.substring(idx+".".length())).length() != 2){
            throw new RuleException("Price must be a floating point number with two decimal places");
        }
        double price = 0;
        try {
            price = Double.parseDouble(priceValue);
        }catch (Exception e){
            throw new RuleException("Price must be a floating point number");
        }

        if(price <= 0.49){
            throw new RuleException("Price must be a number greater than 0.49");
        }
	}
	
}
