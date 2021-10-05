import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class GSLRAgent extends Agent {


    protected void setup() {
        // Create and show the GUI
        InputDialogBox myGui = new InputDialogBox(this);
        myGui.showGui();
        System.out.println("Hello world! I'm a OneShot Gradient Linear Regression agent!");
        System.out.println("My local name is " + getAID().getLocalName());

    }

    public void getX(final String x) {
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                GradientLinearRegression GSLR = new GradientLinearRegression();
                System.out.println("Regression model equation:\nY = "+GSLR.getB0()+" + "+GSLR.getB1()+"X");
                System.out.print("Proyected Value of Y:");
                System.out.print(GSLR.getB0()+GSLR.getB1()*Double.parseDouble(x));
            }
        });

    }
}
