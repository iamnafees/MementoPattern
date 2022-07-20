public class Originator {

    private String articale;

    public  Originator(){

    }

    public  void  setArticale(String articale) {
        this.articale = articale;
    }

    public String getArticale(){
        return this.articale;
    }

    public Memento save(){
        return  new Memento(articale);
    }

    public void restore(Memento m) {
        this.articale = m.getStep();
    }
}
