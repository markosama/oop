public  class professor extends person{
    int numofpublications;
    public professor(String name , String phone , int numofpublications )
    {
        super(name,phone);
        this.numofpublications=numofpublications;
    }
    public void showacademicposition()
    {
        if (numofpublications <8)
        {
            System.out.println("assistant professor");
        }
        else if(numofpublications >= 8 && numofpublications <16)
        {
            System.out.println("associate-professor");
        }
        else if(numofpublications >=16)
        {
            System.out.println("Full professor");
        }
    }

    public void setNumofpublications(int numofpublications) {
        this.numofpublications = numofpublications;
    }

    @Override
    public String getvactiondays() {
        return "3";
    }
}