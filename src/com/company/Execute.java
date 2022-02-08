package com.company;


import java.util.HashMap;

public class Execute {
    private HashMap<String,Commands> subscribed_obj;

    public Execute(){
        subscribed_obj = new HashMap<>();
    }

    private Commands ObjectFactory(String obj) {

        obj=obj.toLowerCase();
        switch(obj) {
            case "apple":return new Apple();

            case "frog":return new Frog();

            case "banana":return new Banana();

            case "salt":return new Salt();

            case "ink":return new Ink();

            case "blood":return new Blood();

            case "sky":return new SKY();

            default: return null;

        }
    }

    private boolean Subscribe(String object){
        Commands obj = ObjectFactory(object);
        if (obj==null) return false;

        subscribed_obj.put(object.toLowerCase(),obj);
        return true;
    }

    private boolean UnSubscribe(String object){
        if (subscribed_obj.containsKey(object.toLowerCase())){
            subscribed_obj.remove(object.toLowerCase());

            return true;
        }

        return false;
    }


    private void colorMatch(String color) {

        subscribed_obj.forEach((k, v) -> {
                    if(v.colors.containsKey(color)) {
                        System.out.println(v.render(color.toLowerCase()));
                    }
                }
        );

    }

    private void printAllSubscribed() {
        System.out.print("[");
        subscribed_obj.forEach((k, v) -> {
                    System.out.println(",");
                }
        );
        System.out.println("]");
    }


    private String RunCommand(String command) {
        if(command.startsWith("+")) {
            return "subscribe";
        }
        else if(command.startsWith("-")) {
            return "unsubscribe";
        }
        else {
            return command;
        }
    }

    void getCommands(String command) {

        switch(RunCommand(command.toLowerCase())) {
            case "list": printAllSubscribed();
                break;
            case "subscribe":

                if(Subscribe(command.substring(1))) {
                    System.out.println("Subscribed "+command.substring(1));
                }
                else {
                    System.out.println("You have entered the wrong command!!");
                }
                break;
            case "unsubscribe":
                if(UnSubscribe(command.substring(1))) {
                    System.out.println("unSubscribed "+command.substring(1));
                }
                else {
                    System.out.println("You have entered the wrong command!! Please enter the entity which is already subscribed");
                }
                break;
            case "exit":

                System.exit(0);
            default:
                colorMatch(command);
                break;
        }

    }



}
