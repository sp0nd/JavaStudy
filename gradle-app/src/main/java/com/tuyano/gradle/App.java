package com.tuyano.gradle;

public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println("============App class============");
        app.showMessage("H o n g");
        app.showMessage("L e e");
        System.out.println("============App class============");
    }
    public boolean showMessage(String name) {
        try {
            System.out.println(this.getMessage(name));
        }
        catch(Exception e){
            System.out.println("[ERR:"+e.getMessage()+"]");
            return false;
        }
        finally {
            return true;
        }
    }

    public String getMessage(String name) throws Exception {
        if(name == null || name == ""){
            throw new Exception("no name !!");
        }
        return "Hi,"+ name +". Welcome to you&Ryu Channel !!!";
    }
}
