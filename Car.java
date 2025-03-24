  
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
        private String make;
        private int yearModel;
        private int speed;
        public Car(int yModel, String m)
        {
            yearModel=yModel;
            make=m;
            speed=0;
        }
        
        public int getYearModel()
        {
            return yearModel;
        }
        
        public String getMake()
        {
            return make;
        }
        
        public int getSpeed()
        {
            return speed;
        }
        
        public void accelerate()
        {
            speed=speed+5;
        }
        
        public void brake()
        {
            speed=speed-5;
        }
}
