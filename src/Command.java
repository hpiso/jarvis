import java.io.Serializable;

/**
 * Created by hugopiso on 03/12/2016.
 */
public class Command implements Serializable{

        public Command(String command){
            switch (command){
                case "switch on bedroom":
                    action = "switch on";
                    element = "bedroom";
                    break;
                case "switch off bedroom":
                    action = "switch off";
                    element = "bedroom";
                    break;
                case "switch on living room":
                    action = "switch on";
                    element = "living room";
                    break;
                case "switch off living room":
                    action = "switch off";
                    element = "living room";
                    break;
                default:
                    break;
            }
        }

    public Command() {
    }

    public Command(String action, String element) {
        this.action = action;
        this.element = element;
    }

    private String action;
        private String element;

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getElement() {
            return element;
        }

        public void setElement(String element) {
            this.element = element;
        }

}
