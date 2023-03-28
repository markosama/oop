public  class student extends person{
    private double gpa;
    public student( String Name ,  String phone , double gpa)
    {
        super(Name,phone);
        this.gpa =gpa;
    }
    public void showgeneralgrade()
    {
        if(gpa<=4 && gpa>=3.4)
        {
            System.out.println("excellent");
        }
        else if(gpa<=3.4 && gpa>=2.8)
        {
            System.out.println("very good");
        }
        else if(gpa<=2.8 && gpa>=2.4)
        {
            System.out.println("good");
        }
        else if(gpa<=2.4 && gpa>=2.0)
        {
            System.out.println("pass");
        }
        else if (gpa<2.0)
        {
            System.out.println("fail");
        }
        else {
            return;
        }
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String getvactiondays() {
        return "2";
    }
}
