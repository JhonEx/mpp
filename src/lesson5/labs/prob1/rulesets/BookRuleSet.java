package lesson5.labs.prob1.rulesets;

import lesson5.labs.prob1.gui.BookWindow;

import java.awt.Component;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		BookWindow bookWindow = (BookWindow)ob;
        String isbnValue = bookWindow.getIsbnValue();
        String titleValue = bookWindow.getTitleValue();
        String priceValue = bookWindow.getPriceValue();

        if(isbnValue.trim().isEmpty() || titleValue.trim().isEmpty() || priceValue.trim().isEmpty()) {
            throw new RuleException("All fields must be nonempty");
        }

        for(int i=0; i<isbnValue.length(); i++){
            if(isbnValue.charAt(i) < '0' || isbnValue.charAt(i) > '9'){
                throw new RuleException("the Isbn must be numeric!");
            }
        }

        if(isbnValue.length() == 10){
            if(isbnValue.charAt(0) != '0' && isbnValue.charAt(0) != '1'){
                throw new RuleException("the first digit must be 0 or 1, when the length of isbn is 10.");
            }
        }else  if(isbnValue.length() == 13){
            if(!(isbnValue.substring(0,3).equals("978")) &&
                    !(isbnValue.substring(0,3).equals("979"))){
                throw new RuleException("the first 3 digits must be either 978 or 979," +
                        " when the length of isbn is 13.");
            }
        }else {
            throw new RuleException("The length of Isbn is either 10, or 13.");
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
