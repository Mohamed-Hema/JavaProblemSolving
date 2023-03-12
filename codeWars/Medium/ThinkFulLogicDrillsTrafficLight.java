package codeWars.Medium;

public class ThinkFulLogicDrillsTrafficLight {
    public class TrafficLights {

        public static String updateLight(String current) {
            switch(current){
                case "green":
                    current = "yellow";
                    break;
                case "yellow":
                    current = "red";
                    break;
                default:
                    current = "green";
            }
            return current;
        }

    }
}
