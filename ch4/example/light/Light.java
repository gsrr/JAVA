public class Light implements LightInterface
{
        String color_;
        int time_;
        Light(String color, int time)
        {
                color_ = color;
                time_ = time;
        }
        public String getColor()
        {
                return color_;
        }

        public int getTimeOut()
        {
                return time_;
        }
        
        public String toString()
        {
                String str = "This is a " + color_ + "light!";
                return str;
        }
}
