public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setArticale("Step1");
        careTaker.addMemento((originator.save()));
        printStep(originator);

        originator.setArticale("Step2");
        careTaker.addMemento((originator.save()));
        printStep(originator);

        originator.restore(careTaker.undo());
        printStep(originator);

        originator.restore(careTaker.redo());
        printStep(originator);


        originator.setArticale("Step3");
        careTaker.addMemento((originator.save()));
        printStep(originator);

        originator.setArticale("Step4");
        careTaker.addMemento((originator.save()));
        printStep(originator);


    }

    public static void printStep(Originator o){

        System.out.println("Current Step" + o.getArticale());

    }
}