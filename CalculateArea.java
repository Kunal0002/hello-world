public class CalculateArea {
    int Length;
    int Height;
    int Area;

    public void Show(){
        Area=Length*Height;
        System.out.println("Calculated Area Is :"+Area);
    }
    public static void main(String[] args){
        CalculateArea Calc=new CalculateArea();
        Calc.Length=80;
        Calc.Height=100;
        Calc.Show();

    }

}
