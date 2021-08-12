class CPU
{
    int price=1000;
    class Processor
    {
        int nof_cores=4;
        String manufacturer="HP";
        void p_details()
        {
            System.out.println("Processor details:");
            System.out.println("_______________________");
            System.out.println("Number of cores : "+nof_cores+"\n"+"Manufacturer : "+manufacturer);
        }
        

    }
    static class RAM
    {
        int memory=2;
        String manufacturer="Dell";
        void ram_details()
        {
            System.out.println("RAM details:");
            System.out.println("_______________________");
            System.out.println("Memory : "+memory+"\n"+"Manufacturer : "+manufacturer);
        }
    }
}
class innerclass
{
    public static void main(String args[]){

        CPU cpu_obj=new CPU();
        CPU.Processor pro_obj=cpu_obj.new Processor();
        pro_obj.p_details();
        CPU.RAM ram_obj=new CPU.RAM();
        ram_obj.ram_details();
    }
}