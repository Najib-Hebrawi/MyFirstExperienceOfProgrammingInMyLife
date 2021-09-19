package MyfirstprojectCLASS;

public class Rectangle {

    private double length,width;


            public void setLength(double len)
            {
                this.length=len;
            }
            public void setWidth(double wid)
            {
                this.width=wid;
            }
                        public double getLength()
                        {
                            return length;
                        }
                        public double getWidth()
                        {
                            return width;
                        }
                                    public void Area()
                                    {
                                        System.out.println("The area is " +(length*width));
                                    }







    public static void main(String[] args) {


        Rectangle r1=new Rectangle();

        r1.setLength(9.0);
        r1.setWidth(5);
        r1.Area();

    }
}
