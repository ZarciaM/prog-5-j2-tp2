package org.zarcia.prog5j2tp2.entity;

import lombok.Getter;

import lombok.Setter;


@Getter
@Setter
public class Renter {
    private Long id;
    private String name;
    private String email;
    private RenterType type;

    public String rent(Item item){
        if(item.isAvalable() == false){
            return ("the item is not available");
        }
        else {
            item.setAvalable(false);
            return(item+" rented succesfuly");
        }

    }

    public String rent(Money money){
        if(money.isAvailable() == true){

            money.setMoneyToPay(money.getAmount()+ money.getAmount()*money.getInterestRate());
            return(money.getAmount()+" has been rented succesfuly");

        }
        if(money.getMoneyToPay() !=0){
            return ("You still have to pay back "+money.getMoneyToPay());
        }
        else {
            return ("you cannot rent this money");
        }

    }

    public String returnItem(Item item){
        item.setAvalable(true);
        return(item.getName() + "has been returned succesfuly");

    }

}
